package com.animales.examen3;

public class Delfin extends Animales {
    private int peso;
    private int velocidad;

    public Delfin(String nombre, int edad, int peso, int velocidad) {
        super(nombre, edad);
        this.peso = peso;
        this.velocidad = velocidad;
    }

    @Override
    public void respirar() {
        System.out.println("El delfín está respirando");
    }

    public void nadar() {
        System.out.println("El delfín está nadando");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void Sonido() {
        System.out.println("El delfín hace un sonido");
    }

	
}
