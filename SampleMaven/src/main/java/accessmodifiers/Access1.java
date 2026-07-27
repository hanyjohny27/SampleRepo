package accessmodifiers;

public class Access1 {
	public void publicdisplay()
	{
		System.out.println("public");
	}
	protected void protecteddisplay()
	{
		System.out.println("protected");
	}
	private void privatedisplay()
	{
		System.out.println("private");
	}
	void defaultdisplay()
	{
		System.out.println("default");
	}

	public static void main(String[] args) {
		
      Access1 access1=new Access1();
      access1.publicdisplay();
      access1.privatedisplay();
      access1.defaultdisplay();
      access1.protecteddisplay();
	}

}
