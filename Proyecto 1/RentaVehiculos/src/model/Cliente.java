package model;

import java.util.ArrayList;

import controller.Reserva;
import controller.Alquiler;


public class Cliente {
	
	public String usuario;
	public String contrasena;
	
	public int celular;
	public String correo;
	
	public Cedula cedula; 
	public TarjetaCredito tarjeta; 
	
	public ArrayList<Reserva> logReservas; 
	public ArrayList<Alquiler> logAlquileres;
	
	
	//Metodos setters
	
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public void setContrasena(String contrasena) {this.contrasena = contrasena;}
	
	public void setCelular(Integer celular) {this.celular = celular;}
	public void setCorreo(String correo) {this.correo = correo;}
	
	public void setCedula(Cedula cedula) {this.cedula= cedula;}
	public void setTarjetaCredito(TarjetaCredito tarjeta) {this.tarjeta = tarjeta;}
	
	//Metodos getters
	
	public Cedula getCedula() {return this.cedula;}
	public TarjetaCredito getTarjetaCredito() {return this.tarjeta;}
	public ArrayList<Reserva> getLogReservas(){return this.logReservas;}
	public ArrayList<Alquiler> getLogAlquileres(){return this.logAlquileres;}


	
	
	
	
	
	

}
