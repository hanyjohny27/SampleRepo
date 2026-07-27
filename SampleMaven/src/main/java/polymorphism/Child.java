package polymorphism;


public class Child extends Parent{
	
	public void print(int a, int b)
	{
		super.print(40,50);
		int sum=a+b;
		System.out.println("Sum from child class"+sum);
	}

	public static void main(String[] args) {
		
		Child child=new Child();
		child.print(20,30);
	}

}
