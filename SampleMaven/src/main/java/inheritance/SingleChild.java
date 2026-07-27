package inheritance;

public class SingleChild extends SingleParent{
	public void substract()
	{
		
		System.out.println(15-12);
	}
	
	public static void main(String[] args) {
		
		SingleChild singleChild=new SingleChild();
		
		singleChild.add();
		singleChild.substract();
	}

}
