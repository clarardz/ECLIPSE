package com.examen5;
import com.examen5.Profesor;
import com.examen5.ExperienciaServicio;


public class ProfesorOrientacion implements Profesor {
	
	protected String email, alumnos;
	
	private ExperienciaServicio experienciaServicio;

	// constructor con el servicio inyectado
	public  ProfesorOrientacion(ExperienciaServicio experienciaServicio) { 
		System.out.println("Inyección en el constructor"); 
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getHorario() { 
		return "8h - 14h";
	}
	// implementación del método del servicio inyectado 
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		System.out.println("Inyección de un literal en un método setter: " 
				+ email); 
		this.email = email;
	}
	@Override
	public String getAlumnos() {
		return alumnos;
	}
	@Override
	public void setAlumnos(String alumnos) {
		System.out.println("Inyección de un literal en un método setter: " 
				+ alumnos); 
		this.alumnos = alumnos;

	}
}