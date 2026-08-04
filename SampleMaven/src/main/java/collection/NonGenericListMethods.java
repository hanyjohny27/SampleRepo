package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List studied=new ArrayList();
		//add method
		studied.add('A');
		studied.add('B');
		studied.add("blue");
		studied.add("green");
		studied.add("red");
		studied.add(10);
		studied.add(30);
		
		//get method
		
		for(int i=0;i<studied.size();i++)
		{
		System.out.println(studied.get(i));
		}
		System.out.println("--------------");
		
		//set method
		
		studied.set(1, "white" );
		
		for(int i=0;i<studied.size();i++)
		{
		System.out.println(studied.get(i));
		}
		System.out.println("--------------");
		// indexof() method
		
		System.out.println("index of green color is -"+ studied.indexOf("green"));
		System.out.println("--------------");
		
		//lastindexof method
		
		studied.add("red");
		for(int i=0;i<studied.size();i++)
		{
		System.out.println(studied.get(i));
		}
		System.out.println("first index of red -"+studied.indexOf("red"));

		
		System.out.println("last index of red -"+studied.lastIndexOf("red"));
		System.out.println("--------------");
		
		//remove() method
		
		studied.remove("white");
		for(int i=0;i<studied.size();i++)
		{
		System.out.println(studied.get(i));
		
		}
		
		//contains()
		
		System.out.println("Is blue present in the list -"+studied.contains("blue"));
		System.out.println("Is white present in the list -"+studied.contains("white"));
		//isEmpty
		System.out.println("--------------");
		System.out.println("Is the studied list empty -"+studied.isEmpty());
		
		studied.removeAll(studied);
		System.out.println("Is the studied list empty -"+studied.isEmpty());
		
		
		}


	

}
