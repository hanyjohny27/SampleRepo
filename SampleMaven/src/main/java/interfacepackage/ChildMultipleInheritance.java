package interfacepackage;

public class ChildMultipleInheritance implements Parent1,Parent2{
	
	public void print()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		
		ChildMultipleInheritance obj=new ChildMultipleInheritance();
		obj.display();//since there is only one implementation method , there is no ambiguity  that which parent class method is called.
		obj.print();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("parent method implementation");
		
	}

}
