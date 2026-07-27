package inheritance;

public class HierarchialChild1 extends HierarchialParent {
	public void hierarchialChild1()
	{
		System.out.println("hierarchialChild1");
	}

	public static void main(String[] args) {
		
		HierarchialChild1 hierarchialChild1=new HierarchialChild1();
		hierarchialChild1.hierarchialParent();
		hierarchialChild1.hierarchialChild1();
	}

}
