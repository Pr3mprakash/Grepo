
 class Parent 
{

	void display()
	{
		System.out.println("parent");
	}
}


 public class child extends Parent
{
	 void display()
	 {
		 System.out.println("Child");
	 }

 
 
 public static void main(String args[])
 {
	 Parent obj=new child();
	 obj.display();
	 
 }
}