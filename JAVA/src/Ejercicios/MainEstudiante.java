package Ejercicios;


public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		estudiante clara = new estudiante();
		estudiante cristina = new estudiante(3,41);
		System.out.println(clara.getEdad());
		System.out.println(clara.getTelefono());
		System.out.println(cristina.getEdad());
		System.out.println(cristina.getId());
		clara.setEdad(37);
		System.out.println(clara.getEdad());

	}

}