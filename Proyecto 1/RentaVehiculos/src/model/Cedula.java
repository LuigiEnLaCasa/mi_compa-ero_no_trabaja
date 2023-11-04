package model;

public class Cedula {
	
	public String nombre;
	public String apellido;
	public int numCedula; 
	public String nacionalidad;
	
	public String fechaNaciemiento; // tipo fecha, cambiar en el futuro
	public String fotoDocumento; //tipo foto, cambiar en el futuro
	

	
	
	
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public void setNumCedula(int num) { this.numCedula = num;}
	public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}
	
	public void setfechaNacimiento(String a) {}// tipo date, determinar en el futuro
	public void setFotoCedula(String b) {}// foto, determinar en el futuro
}
