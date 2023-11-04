package model;

public class AdminLocal {

	public String usuario; 
	public String contrasena;
	public String sede;  //la sede en la que trabaja el administrador
	public int documento;
	
	
	//Metodos setters
	
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public void setContrasena(String contrasena) {this.contrasena = contrasena;}
	public void setSede(String sede) {this.sede= sede;}
	public void setDocumento(Integer documento) {this.documento = documento;}
	
	
	
	
	//Metodos operacionales
	
	public void registrarEmpleados() {};
	
	public void modificarInfoEmpleados() {};
	
}
