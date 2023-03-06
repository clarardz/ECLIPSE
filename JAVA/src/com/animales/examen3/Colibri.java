package com.animales.examen3;

public class Colibri extends Animales {
	//atributos
    private int alas;
    private String color;

    public Colibri(String nombre, int edad, int alas, String color) {
        super(nombre, edad);
        this.alas = alas;
        this.color = color;
    }

    @Override
    public void respirar() {
        System.out.println("El colibrí está respirando");
    }

    public void volar() {
        System.out.println("El colibrí está volando");
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void Sonido() {
        System.out.println("El colibrí hace un sonido");
    }
}
