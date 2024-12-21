
public class MathTests {

	public static void main(String[] args) {
		//Test for Time Clickers
		double n = 1.0;
		double m = 1.1; //Bonus each Time you click "Dimension Shift"
		double cubes = 15.8; //Time Cubes in Millions
		double cubesFloor = 0;
		double nFloor = 0;
		
		//How big is the multiplicator after "i" Generations
		for (int i = 0; i <= 87; i++) {
			cubesFloor = Math.floor(cubes); nFloor = Math.floor(n);
			if (i >= 86 || i == 0) {
				System.out.println(i + " Gen,  " + nFloor + "  Mul,  " + cubesFloor + "  Million TC");
			}
			n = n * m;
			cubes = cubes * m;
			
		}
		
	}

}
