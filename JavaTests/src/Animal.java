
public class Animal {
	String type = "animal";
	
	
	public void myMethod() { // Nur mit Erstellen eines Objektes möglich
		System.out.println("hi");
	}
	static void myMethod2() {// Ohne der Erstellung einer Klasse möglich
		System.out.println("hi2");
	}
	
	public static void main(String args[]) {
		//Animal.myMethod2();
		//Animal animal2 = new Animal();
		//animal2.myMethod();
		Animal animal1 = new Animal();
		
		try {
			Object animal2 = animal1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Whoops");
		}
		
		System.out.println(animal1.type);
		System.out.println();
	}
	

}
