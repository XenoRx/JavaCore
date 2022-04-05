package course2.homework3;

public class hw3App {
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		phonebook.add(233456655, "Ivanov");
		phonebook.add(123123123, "Alekseeva");
		phonebook.add(345543543, "Nishin");
		phonebook.add(686767686, "Davidov");
		phonebook.add(747664746, "Samueva");
		phonebook.add(553665767, "Inaev");
		phonebook.add(978765095, "Samueva");
		phonebook.add(987799088, "Kashin");
		phonebook.add(887888888, "Sincev");
		phonebook.add(777677667, "Ivanov");
		
		phonebook.get("Ivanov");
		phonebook.get("Samueva");
		
	}
	
}
