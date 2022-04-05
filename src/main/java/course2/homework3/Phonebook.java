package course2.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {
	private Map<Integer, String> phonebook;
	
	Phonebook() {
		phonebook = new HashMap<>();
	}
	
	public void add(int number, String lastname) {
		phonebook.put(number, lastname);
	}
	public void get(String lastname){
		if(phonebook.containsValue(lastname)){
			Set<Map.Entry<Integer,String>> set = phonebook.entrySet();
			for(Map.Entry<Integer, String> m:set){
				if (m.getValue().equals(lastname)){
					System.out.println(m.getValue()+" - "+m.getKey());
				}
			}
		} else {
			System.out.println("Name not found");
		}
	}
	
}
