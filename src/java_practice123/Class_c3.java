package java_practice123;

import java.util.Set;
import java.util.TreeSet;

public class Class_c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>names= new TreeSet<String>(); 
		
		names.add("testing");
		names.add("testing");
		names.add("testing");
		names.add("Java"); 
		names.add("Apple");
		names.add("apple");
		names.add("java");
		names.add("selenium");
        names.remove("selenium");
        System.out.println(names);
        for(String updatedvalues : names)
        { 
        	System.out.println(updatedvalues);
        	
	}
        
	}
}
