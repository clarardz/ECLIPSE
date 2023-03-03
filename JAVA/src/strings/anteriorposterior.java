package strings;

public class anteriorposterior {
	public static void CaracterAnteriorPosterior() {
        String cadena = "Holo Xavi que tal estás?";
        int indice = 2;

        char anterior = cadena.charAt(indice - 1);
        char siguiente = cadena.charAt(indice + 1);

        if (anterior == siguiente) System.out.println("Son iguales");
        else System.out.println("No Son iguales");

    }
}
