package course2.homework3;

import java.util.*;

public class Phonebook {
	private final Map<String, Set<Integer>> phonebook;
	
	Phonebook() {
		phonebook = new HashMap<>();
	}
	
	public void add(String lastname, Integer phoneNumber) {
		Set<Integer> number = new HashSet<>();
		number.add(phoneNumber);
		if (!phonebook.containsKey(lastname)){
			phonebook.put(lastname, number);
		}else {
			final Set<Integer> newNumber = phonebook.get(lastname);
			newNumber.add(phoneNumber);
		}
	}
	
	public Set<Integer> get(String lastname) {
		return phonebook.get(lastname);
	}
}
/*
public class Phonebook {
	private String lastname;
	private int number;
	private final ArrayList<Phonebook> phonebook = new ArrayList<>();
	public Phonebook(){
	}
	public Phonebook(String lastname, Integer number) {
		this.lastname = lastname;
		this.number = number;
	}
	
	public void add(String lastname, Integer number){
		phonebook.add(new Phonebook(lastname, number));
	}
	
	public ArrayList<Integer> get(String name){
		ArrayList<Integer> numbers = new ArrayList<>();
		for (Phonebook pb: phonebook) {
			if (pb.getLastname().equalsIgnoreCase(name)) {
				numbers.add(pb.getNumber());
			}
		}
		return numbers;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public Integer getNumber() {
		return number;
	}
}*/
