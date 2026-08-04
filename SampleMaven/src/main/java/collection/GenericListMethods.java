package collection;

import java.util.*;

public class GenericListMethods {

	public static void main(String[] args) {
	List<String> color=new ArrayList <String>();
	//add method
	color.add("violet");
	color.add("indigo");
	color.add("blue");
	color.add("green");
	color.add("red");
	color.add("orange");
	color.add("yellow");
	
	//get method
	
	for(int i=0;i<color.size();i++)
	{
	System.out.println(color.get(i));
	}
	System.out.println("--------------");
	
	//set method
	
	color.set(1, "white" );
	
	for(int i=0;i<color.size();i++)
	{
	System.out.println(color.get(i));
	}
	System.out.println("--------------");
	// indexof() method
	
	System.out.println("index of green color is -"+ color.indexOf("green"));
	System.out.println("--------------");
	
	//lastindexof method
	
	color.add("red");
	System.out.println("first index of red -"+color.indexOf("red"));

	
	System.out.println("last index of red -"+color.lastIndexOf("red"));
	System.out.println("--------------");
	
	//remove() method
	
	color.remove("white");
	for(int i=0;i<color.size();i++)
	{
	System.out.println(color.get(i));
	
	}
	
	//contains()
	
	System.out.println("Is blue present in the list -"+color.contains("blue"));
	System.out.println("Is white present in the list -"+color.contains("white"));
	//isEmpty
	System.out.println("--------------");
	System.out.println("Is the color list empty -"+color.isEmpty());
	
	color.removeAll(color);
	System.out.println("Is the color list empty -"+color.isEmpty());
	
	
	}

}
