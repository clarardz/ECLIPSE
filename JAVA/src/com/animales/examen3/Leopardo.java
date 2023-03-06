package com.animales.examen3;


public class Leopardo extends Animales {
    private String habitat;
    private int velocidad;

    public Leopardo(String nombre, int edad, String habitat, int velocidad) {
        super(nombre, edad);
        this.habitat = habitat;
        this.velocidad = velocidad;
    }

    @Override
    public void respirar() {
        System.out.println("El leopardo está respirando");
    }

    public void correr() {
        System.out.println("El leopardo está corriendo");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
          this.velocidad = velocidad;
    }

    public void Sonido() {
        System.out.println("El leopardo hace un sonido");
    }
}