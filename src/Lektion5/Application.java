package Lektion5;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// Vi har skapat ett objekt av klassen person
		Person husseinPerson = new Person("Hussein");
		husseinPerson.writeName();

		husseinPerson.setName("Thunder");
		husseinPerson.writeName();
	}

}
