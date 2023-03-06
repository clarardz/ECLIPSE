package com.animales.examen3;


public abstract class Animales {
	//atributos
    protected String nombre;
    protected int edad;
    
    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
  //metodos
    public abstract void respirar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
