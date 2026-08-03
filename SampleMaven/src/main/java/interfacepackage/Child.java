package interfacepackage;

public class Child implements ParentInterface{
	
	
	public void print()
	{
		
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		ParentInterface obj1=new Child();//creating interface reference
		//why need ref?
		//usb port is an interface.
		obj1.display();
		

	}

	@Override
	public void display() {
		System.out.println("Child class implements abstract method from interface");
		
	}

}
