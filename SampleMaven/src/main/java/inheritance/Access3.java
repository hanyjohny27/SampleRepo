package inheritance;

import accessmodifiers.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		Access1 obj1=new Access1();
		//obj1.publicdisplay();
		
		Access3 access3=new Access3();
		access3.publicdisplay();
		access3.protecteddisplay();
	}

}
