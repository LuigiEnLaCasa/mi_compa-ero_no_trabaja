package model;

public class Vehiculo {
	
	public String placa;
	public String marca;
	public String modelo;
	public String color;
	public String transmision;
	public String categoria;
	public int capacidad;
	public String disponibilidad; // si está disponible, en mantenimiento o alquilado
	public String registro;
	
	
	
	//Metodos setters
	
	
	public void setPlaca(String placa) {this.placa = placa;}
	public void setMarca(String marca) {this.marca = marca;}
	public void setModelo(String modelo) {this.modelo = modelo;}
	public void setColor(String color) {this.color = color;}
	public void setTransmision(String transmision) {this.transmision = transmision;}
	public void setCategoria(String categoria) {this.categoria = categoria;}
	public void setCapacidad(Integer capacidad) {this.capacidad = capacidad;}
	public void setDisponibilidad(String disponibilidad) {this.disponibilidad = disponibilidad;}
	public void setRegistro(String registro) {this.registro= registro;}
	
	
	
	//Métodos
	
	public void getLogVehiculo() {};

}
