package inheritance;

public class Child extends Parent {
	public void child()
	{
		System.out.println("This is child class");
		
	}

	public static void main(String[] args) {
		Child child=new Child();
		
		
		child.child();
		child.parent();
		child.grandParent();
	}

}
