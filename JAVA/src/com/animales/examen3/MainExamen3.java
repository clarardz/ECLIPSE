package com.animales.examen3;

public class MainExamen3 {
    public static void main(String[] args) {
        Colibri colibri1 = new Colibri("PEPE", 2, 10, "verde");
        Delfin delfin1 = new Delfin("MOJADITO", 7, 200, 30);
        Leopardo leopardo1 = new Leopardo("MANCHAS", 4, "Savana", 70);

        System.out.println("Nombre del colibrí: " + colibri1.getNombre());
        System.out.println("Edad del delfín: " + delfin1.getEdad());
        System.out.println("Hábitat del leopardo: " + leopardo1.getHabitat());

        colibri1.setNombre("Pepito");
        delfin1.setEdad(8);
        leopardo1.setHabitat("Selva");

        System.out.println("Nuevo nombre del colibrí: " + colibri1.getNombre());
        System.out.println("Nueva edad del delfín: " + delfin1.getEdad());
        System.out.println("Nuevo hábitat del leopardo: " + leopardo1.getHabitat());

        colibri1.Sonido();
        delfin1.Sonido();
        leopardo1.correr();

        System.out.println("Alimentación de los seres vivos: " + SeresVivos.alimentacion);
    }
}
