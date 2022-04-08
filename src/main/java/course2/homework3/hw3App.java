package course2.homework3;

import java.util.HashSet;

public class hw3App {
	private static final String[] names = {
			"Ivanov", "Alekseeva", "Nishin", "Davidov",
			"Samueva", "Inaev", "Samueva",
			"Kashin", "Sincev", "Ivanov"
	};
	
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		phonebook.add("Ivanova",9129374);
		phonebook.add("Nikolaev",78178238);
		phonebook.add("Sincov",123123123);
		phonebook.add("Ivanova",84757463);
		phonebook.add("Pumba",3334455);
		phonebook.add("Purumba",5554433);
		System.out.println(output(names));
		String name = "Ivanova";
		System.out.println(name + " : " + phonebook.get(name));
	}
	public static HashSet<String> output(String[] names) {
		final HashSet<String> set = new HashSet<>();
		for (String s : names) {
			int count = 0;
			if (!set.contains(s)) {
				set.add(s);
				for (String text : names) {
					if (s.equalsIgnoreCase(text)) {
						count++;
					}
				}
				System.out.println(s + " - " + count);
			}
		}
		return set;
	}
}
