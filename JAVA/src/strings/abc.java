package strings;
import java.util.Scanner;

// escribe un programa que compruebe que el substring "abc" se encuentra en un String dado, pero no puede encontrarse ni al comienzo, ni al final.
public class abc {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena: ");
        String cadena = sc.nextLine();
        
        
        if (cadena.startsWith("abc")|| cadena.endsWith("abc")) {
            System.out.println("El substring \"abc\" se encuentra al principio o al final");
        } else if (cadena.contains("abc")) {
        	 System.out.println("El substring \"abc\" se encuentra dentro de la cadena");
        	
           
      } else {System.out.println("El substring \"abc\" no se encuentra en la cadena");
    }}}
