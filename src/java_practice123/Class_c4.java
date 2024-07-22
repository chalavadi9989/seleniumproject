package java_practice123;

import java.util.Map;
import java.util.TreeMap;

public class Class_c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Map<String,String>data = new TreeMap<String,String>(); 
		
		data.put("roll", "01"); 
		data.put("Age", "30"); 
		data.put("place", "Hyd");
		data.put("city", "Telengana");
		data.put("null", "null");
		data.put("10c","HYD");
		data.remove("city");
		System.out.println(data);
		

	}

}
