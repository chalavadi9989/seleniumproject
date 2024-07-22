package java_practice123; 

import java.util.LinkedHashSet;
import java.util.Set;

public class Class__c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Set<String>names=new LinkedHashSet<String>(); 
		
		names.add("testing");
		names.add("testing");
		names.add("testing");
		names.add("Java");
		names.add("java");
		names.add("selenium");
		names.add(null);
		names.add(null);
        names.remove("selenium");
        System.out.println(names);
        for(String updatedvalues : names)
        { 
        	System.out.println(updatedvalues);
        	
	}

	} 
}
// LinkedHashSet is allow the Null Values and Doesn't allow the Duplicate Values'