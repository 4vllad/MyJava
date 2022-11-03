
public class Main {

	public static void main(String args[]) {
		String alex = "Alex";
		Integer num1 = 5;
		boolean switch1 = false;

		String sum = alex + num1;
		
		
		System.out.println("Hello World");
		System.out.println(alex + " " + num1 + " " + switch1 + " " + sum); //Ausgabe von dem Wert
		System.out.println(alex + " is " + alex.getClass()); // Ausgabe von dem Typ
		System.out.println("Is " + alex + " a String? Answer: " + alex instanceof String); //Nur instanceof ausgegeben
		System.out.println("Is " + num1 + " an Integer? Answer: " ); // "instanceof Integer" Ausgabe nicht möglich
		System.out.println(num1 instanceof Integer);// Nur einzeln Ausgabe möglich
		
		if (alex instanceof String) {
			System.out.println("yes");
		}
		else { // "alex instanceof Integer" Gibt Fehler beim kompeilieren 
			System.out.println("no");
		}
	}
}
