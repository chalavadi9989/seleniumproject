package java_practice123;

import java.util.HashSet;
import java.util.Set;

public class Class_c1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub 
		
		Set<String>names= new HashSet<String>();
names.add("testing");
names.add("testing"); 
names.add("testing");
names.add("Java");
names.add("java");
names.add("Selenium");
names.add(null);
names.add(null); 
//names.remove(names);
System.out.println(names);
for(String updatedvalues : names)
{ 
	System.out.println(updatedvalues);
	
}

} 
	}