package strings;
import java.util.Scanner;

//dado dos String compruebe si los dos primeros caracteres y los dos últimos son iguales.
public class ej2pag413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la primera cadena: ");
        String cadena1 = sc.nextLine();
        System.out.println("Escribe la segunda cadena: ");
        String cadena2 = sc.nextLine();
        
        if (cadena1.length() < 2 || cadena2.length() < 2) {
            System.out.println("Las cadenas deben tener al menos dos caracteres");
        } else if (cadena1.substring(0,2).equals(cadena2.substring(0,2)) && cadena1.substring(cadena1.length()-2).equals(cadena2.substring(cadena2.length()-2))) {
            System.out.println("Los dos primeros caracteres y los dos últimos caracteres de ambas cadenas son iguales");
        } else {
            System.out.println("Los dos primeros caracteres y/o los dos últimos caracteres de ambas cadenas son diferentes");
        }
    }
}