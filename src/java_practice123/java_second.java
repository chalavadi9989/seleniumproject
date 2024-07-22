package java_practice123;

import java.util.ArrayList;
import java.util.List;

public class java_second {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		List<Integer>rollnumbers= new ArrayList<Integer>();
		rollnumbers.add(10);
		rollnumbers.add(10);
		rollnumbers.add(null);
		rollnumbers.add(null);
		rollnumbers.add(99);
		rollnumbers.add(40);
		rollnumbers.add(66);
		rollnumbers.add(6633);
		rollnumbers.add(6223);
		rollnumbers.addAll(rollnumbers);
		//rollnumbers.remove(2);
		
for (int i=0; i<= rollnumbers.size()-1; i++) 
{ 
	System.out.println(rollnumbers.get(i));
}
	}

}
