package SelfNote.Week5;

import java.util.HashMap;

public class Note_5_HashMap {

	public static void main(String[] args) {

		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper Class
		// ex: (name,email),(username,userID),(country,capital)
		
		HashMap<String,String> countries = new HashMap<String,String>();
		
		//add a key and value
		countries.put("USA","Washington DC");
		countries.put("India","New Delhi");
		countries.put("Russia","Moscow");
		countries.put("China","Beijing");
		
		System.out.println(countries);

		countries.remove("USA");

		System.out.println(countries.get("Russia")); // Moscow

		System.out.println(countries.size()); // 3

		countries.replace("USA", "Detroit"); 

		System.out.println(countries.containsKey("England")); // false

		System.out.println(countries.containsValue("Beijing")); // false

    countries.clear();

    System.out.println(countries); // {}
		

		
	}
}