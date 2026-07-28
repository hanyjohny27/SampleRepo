package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city, String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
		//this.ref.name="Anitta";
		//this.ref.age=37;
		//this.ref.address="def";
	}
	public void print()
	{
		System.out.println(ref.name);
		System.out.println(ref.age);
		System.out.println(ref.address);
		
		System.out.println(city);
		System.out.println(state);
	}
	

	public static void main(String[] args) {
		//Aggregation1 obj3=new Aggregation1();
		
		Aggregation1 obj=new Aggregation1("Hany",35,"abc");
		Aggregation2 obj2=new Aggregation2("EKM","Kerala",obj);
		obj2.print();
		

	}

}
