//Reverses a String
public class ReverseString {

	public static void main(String[] args) {
		String name = "Alex";
		String revName = "";
		String[] nameArr = name.split("");
		
		for(int i = name.length() - 1; i > -1; i--) {
			revName += nameArr[i];
		}
		System.out.println(revName);
	}

}
