package inheritance;

public class HierarchialChild2 extends HierarchialParent {
	public void hierarchialChild2()
	{
		System.out.println("hierarchialChild2");
	}

	public static void main(String[] args) {
		HierarchialChild2 hierarchialChild2=new HierarchialChild2();
		hierarchialChild2.hierarchialParent();
		hierarchialChild2.hierarchialChild2();
		
	}

}

		

