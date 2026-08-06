package collection;

import java.util.*;

public class FoeEachExample {

	public static void main(String[] args) {
		int	array[]= {30,40,50};
		for(int a: array)
		{
			System.out.println(a);
		}
		
		System.out.println("--------------");
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(60);
		list.add(70);
		list.add(80);
		
		for(int b:list)
		{
			
			System.out.println(b);
		}
		
		List nonGenericList=new ArrayList();
		
		nonGenericList.add("green");
		nonGenericList.add(10);
		nonGenericList.add(3.14f);
		System.out.println("--------------");
		
		for(Object c:nonGenericList)
		{
			
			System.out.println(c);
		}

	}

}
