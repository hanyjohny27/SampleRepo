package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
	
	String color="green";
	
	public void print()
	{
		System.out.println(color);//prints green -child variable
		
		System.out.println(super.color);//print red-parent variable
	}

	public static void main(String[] args) {
		
		
		SuperVariableChild superVariableChild=new SuperVariableChild();
		superVariableChild.print();

	}

}
