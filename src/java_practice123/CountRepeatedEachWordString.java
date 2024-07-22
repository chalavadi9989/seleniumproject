package java_practice123; 



import java.util.HashMap;
import java.util.Map;

public class CountRepeatedEachWordString {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Map<String,Integer>Mapstore = new HashMap<String,Integer>();
		 
		String text = "Testing is good and testing is best";
		String[] spliteddata =text.split(" "); 
		
		for (String mydata : spliteddata) 
		{ 
			if(Mapstore.containsKey(mydata))
			{ 
				Mapstore.put(mydata,1);
				
			} 
			else 
			{ 
				Mapstore.put(mydata,Mapstore.get(mydata)+1);			
		}

		} 
		System.out.println(Mapstore);
	} 
}
	

