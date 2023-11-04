package model;

public class TarjetaCredito {
	
	public String nombreTarjeta; 
	public int numeroTarjeta;
	public String fotoTarjeta; // este formato va a tener que cambiar en el futuro
	public boolean bloqueada = false; 
	
	
	
	//metodos setters
	
	public void setNombreTarjeta(String nombreTarjeta) {this.nombreTarjeta= nombreTarjeta;}
	public void setNumeroTarjeta(int numTarjeta) {this.numeroTarjeta= numTarjeta;}
	public void setFotoTarjeta(String s) {} //tipo foto establecer en el futuro
	public void setEstatusBloqueada(boolean bloqueada) {this.bloqueada= bloqueada;}
	
	
}
