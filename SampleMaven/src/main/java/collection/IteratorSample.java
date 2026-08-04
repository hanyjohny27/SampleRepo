package collection;

import java.util.*;

public class IteratorSample {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("TajMahal");
		s.add("Qutab Minar");
		s.add("BigwallofChina");
		//iterator
		Iterator<String>  it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}

	}

}
