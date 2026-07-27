package inheritance;

public class SuperConstructorChild extends SuperConstructorParent {
	
	public SuperConstructorChild()
	{
		super(5,6);
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();
		

	}

}
