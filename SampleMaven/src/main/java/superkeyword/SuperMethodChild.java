package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	
	public void print()
	{
		super.print();//calls parent class print method 
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		
		SuperMethodChild superMethodChild=new SuperMethodChild();
		superMethodChild.print();
		
		
	}

	
}
