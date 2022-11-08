
public class MathTests {

	public static void main(String[] args) {
		//Test for Time Clickers
		double n = 1.0;
		double m = 1.1; //Bonus each Time you click "Dimension Shift"
		double cubes = 15.8; //Time Cubes in Millions
		
		//How big is the multiplicator after "i" Generations
		for (int i = 0; i<=50; i++) {
			System.out.println(i + " Generation,  " + n + " Multiplicator, " + cubes + " Million Time Cubes");
			n = n * m;
			cubes = cubes * m;
		}
		
	}

}
