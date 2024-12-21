
public class Cat extends Animal {
	final String sound = "meow";
	
	public static void main(String args[]) {
		System.out.println("meow");
		//System.out.println(animal1.name);//Not defined here
		Cat cat1 = new Cat();
		
		System.out.println(cat1.type);// Vererbt von Animal
		
		System.out.println(cat1.sound);
	}
}
