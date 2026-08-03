package abstraction;

public class Child extends Parent{
	
	public void childMethod()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		
		//how to create reference for interface
		Parent ref=new Child();
		
		ref.display();
		//ref.childMethod()    //we cannot call childmethod as ref is a reference to the parent interface
		//which can only access interface methods.
	}

	@Override
	public void display() {
		System.out.println("Abstraction");
		
		
	}

	@Override
	public void print() {
	
		System.out.println("print method");
	}

}
