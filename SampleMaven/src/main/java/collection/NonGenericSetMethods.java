package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {
	public static void main(String[] args) {
		Set set=new HashSet();
		Set set2=new HashSet();
		//add method
		set.add('J');
		set.add('K');
		set.add(10);
		set.add(9);
		set.add("Queen");
		
		Set set1=new HashSet();
		set1.add("Black");
		set1.add('A');
		//addall method
		set.addAll(set1);
		
		System.out.println(set);
		//contains method
		System.out.println("is set contains 50 -"+set.contains(50));
		System.out.println("is set contains 10 -"+set.contains(10));
		
		//containsall method
		
		System.out.println("is set contains all elements of set1 -"+set.containsAll(set1));
		System.out.println("is set1 contains all elements of set -"+set1.containsAll(set));
		
		//isempty
		
		System.out.println("is set empty -"+set.isEmpty());
		System.out.println("is set2 empty -"+set2.isEmpty());
		
		//remove
		
		set.remove(30);
		System.out.println(set);
		
		//removeall
		
		set.removeAll(set1);
		System.out.println(set);
		
		//size
		
		System.out.println(set1.size());
		
		//clear
		
		set1.clear();
		System.out.println(set1);
		
		

		}


}
