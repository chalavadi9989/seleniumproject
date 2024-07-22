package java_practice123;

import java.util.Arrays;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TSet_assendingAndRemove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] rollnumber = {10,30,10,2,1,10,40,50,10}; 
		 
	     Set<Integer>roll = new TreeSet<Integer>(Arrays.asList(rollnumber)) ; 
		
		//Set<Integer>roll = new LinkedHashSet<Integer>(Arrays.asList(rollnumber)); 
		System.out.println(roll);
		

	}

}
 
// This program is both TreeSet And LinkedHashSet