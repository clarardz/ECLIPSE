package com.examen5;

public interface Profesor {
	public abstract String getHorario();
	// nuevo método para obtener la experiencia a partir del servicio que se inyectará 
	public abstract int getExperiencia();
	
	public String getEmail();
	public void setEmail(String email); 
	public String getAlumnos();
	public void setAlumnos(String alumnos);
}