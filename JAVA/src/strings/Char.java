package strings;
import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);

		String palabra = Name.nextLine();
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println (palabra.charAt(i));
			
		}
	}
}