
public class FirstClass {
	
	int a;
	public void display()
	{
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args)
	{
		FirstClass obj=new FirstClass();
		obj.display();
		obj.a=50;
		System.out.println("Value of a is : "+obj.a);
		
	}

}
