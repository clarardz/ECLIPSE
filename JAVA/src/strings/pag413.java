package strings;

public class pag413 {

	
	//dado dos String compruebe si los dos primeros caracteres son iguales.
	
	public static void main(String[] args) {
		String palabra1 = "Hola";
		String palabra2 = "	Ola";

		if (palabra1.substring(0, 2).equals(palabra2.substring(0, 2))) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}
	}
}



