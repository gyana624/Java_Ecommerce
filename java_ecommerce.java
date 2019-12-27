package co.gyana;
//Textual representation how an object will look like in memory
//whatever we write in class is an actual property of object as we are describing the object
//If you want anything which should belong to class make it static!!
class Product
{
	//Attributes
	  //private
	  int pid;
	  String name;
	  int price;
	//Constructor
	
	
	Product()
	{
		System.out.println("<<<<Product object constructed<<<<");
	}
	//Methods
	//To write data in product object we have this method
	
	void setProductDetails(int pid,String name,int price)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		//System.out.println(">>>Data return in product object");
	}
	//Method (Behavior)
	//To write data in product Object we have this method
	
	void showProductDetails() 
	{
		System.out.println("-------Product ID:"+pid+"--------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
	}
	void setPid(int pid) 
	{
		this.pid=pid;//This means reference to current object
		//LHS belongs to object & RHS belongs to Method	

		//Setter
	}
	//Getter 
	int getPid() 
	{
		return pid;
	}
}

class Mobile extends Product    //IS-A Relation,Mobile IS-A Product,Mobile child,Product is parent
{
	//Additional attribute of mobile other than products 
	String os;
	int ram;
	int sdCardSize;
	Mobile()
	{
		System.out.println(">>>>Mobile Object Constructed>>>>");
		
	}
	//I have redefined the same method from from the parent into the child with different inputs
	//I have now teo methods in child,1 from parent ,1 of child
	//both are different as in based on inputs (even though name is same)
	//METHOD OVERLOADING:  This is know as method overloading : same method with different parameter
	void setProductDetails(int pid,String name,int price,String os,int ram,int sdCardSize)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.os=os;
		this.ram=ram;
		this.sdCardSize=sdCardSize;
		System.out.println(">>>Data written in mobile object");
	}
	//Lets redefine showProductDetail as well
	//Child method will executed and not the parent method
	//METHOD OVERRIDING: same method same with inputs in Parent child relationship
	void showProductDetails() 
	{
		System.out.println("-------Product ID:"+pid+"--------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("OS:\t"+os);
		System.out.println("RAM:\t"+ram);
		System.out.println("sdCardSize:\t"+sdCardSize);
		
	}
	
	
}

public class InheritanceApp {
	//MAIN IS EXECUTED BY JVM WHEN MY PROGRAM WILL RUN!!
	public static void main(String[] args) 
	{
		/*
		//Create an Object:Product object
		Product product1=new Product();
		//Product1 is not an object its reference its a reference which holds the hashCode of the Object in hexadecimal notation
		System.out.println("Product is :"+product1);//we get 5ce65a89 as  a hashCode,So product is reference variable not an object
		
		//Writing data in object
		product1.setProductDetails(101,"iPhone X",50000);
		//Reading data from the object
		product1.showProductDetails();
		//Lets write the data directly
		Product product2=new Product();
		product2.setPid(202);
		product2.name="Sasmsung";
		product2.price=50000;
		product2.showProductDetails();
		*/
		
		//Requesting to get Mobile object constructed  
		Mobile mobile=new Mobile();	
		//Product object constructed before Mobile object!!->Rule to inheritance( object to object)
//		mobile.setProductDetails(303,"Micromax",10000);
//		mobile.showProductDetails();
		mobile.setProductDetails(404, "Realme", 17000, "android", 4, 64);
		mobile.showProductDetails();
	}

}
