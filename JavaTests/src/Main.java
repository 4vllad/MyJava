
public class Main {

	public static void main(String args[]) {
		String alex = "Alex";
		Integer num1 = 5;
		boolean switch1 = false;

		String sum = alex + num1;
		String sum2 = alex + switch1;
		//String sum3 = num1 + switch1; //undefined
		
		
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
		
		System.out.println(sum.getClass());// String + Integer -> String
		System.out.println(sum2.getClass());// String + Boolean -> String
		//System.out.println(sum3.getClass());// num + Boolean -> undefined
		
		
		System.out.println(5%3);// Modulus -> Rest von 5/3 ( 2 )
		Animal animal1 = new Animal();
		
		animal1.myMethod(); //mit public void
		//Animal.myMethod3();// mit public static
	}
}
