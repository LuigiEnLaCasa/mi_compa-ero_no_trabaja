package view;

import java.util.Scanner;
import java.util.Set;

import model.CargaDatos;

public class InicioSesion {
	
	
	public static void main(String[] args) {
	System.out.println("BIENVENIDO AL SISTEMA DE RENTA");
	
	
	//Aquí se cargan los datos de usuarios de toda la aplicación (iniciar el app)
	CargaDatos cd = new CargaDatos();
	cd.cargarTodo(cd);

	
	Scanner scanner = new Scanner(System.in);
	
	boolean seguir= true;
	try {
	while(seguir) {
	System.out.println("===================================================");
	System.out.println("| Presione enter para continuar o escriba salir |");
	System.out.println("===================================================");
	System.out.println(">");
	String userContinuar = scanner.nextLine();
		
	if (!userContinuar.equals("salir")) {
		
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	System.out.println("POR FAVOR INICIA SESIÓN\n");
	
	System.out.println("Usuario:\n>");
	String user = scanner.nextLine();
	System.out.println("Contraseña:\n>");
	String password = scanner.nextLine();
	
	
	//filtro tipo de usuarios
	//sets con los usuarios con cada tipo
	
	
	Set<String> setAdminGs = cd.aGlobales.keySet();
	Set<String> setAdminLs = cd.aLocales.keySet();
	Set<String> clientela = cd.clientes.keySet();
	Set<String> setMantenimiento = cd.eMantenimiento.keySet();
	Set<String> setServicio = cd.eServicio.keySet();
	
	
	if( (setAdminGs.contains(user)) && (cd.aGlobales.get(user).contrasena).equals(password) ) {
		ViewAdminGlobal vag = new ViewAdminGlobal();
		ViewAdminGlobal.main(args);
		seguir =false;}
	else if( (setAdminLs.contains(user)) && (cd.aLocales.get(user).contrasena).equals(password) ) {
		ViewAdminLocal val = new ViewAdminLocal();
		
		val.setSede(cd.aLocales.get(user).sede);;
		val.main(args);
		seguir =false;
		
	}
	else if( (clientela.contains(user)) && (cd.clientes.get(user).contrasena).equals(password)) {
		ViewCliente vc = new ViewCliente();
		vc.main(args);
		seguir =false;
		
	}
	else if ( (setMantenimiento.contains(user)) && (cd.eMantenimiento.get(user).contrasena).equals(password)) {
		ViewEmpleadoMantenimiento vem = new ViewEmpleadoMantenimiento();
		vem.main(args);
		seguir =false;
		
	}
	else if( (setServicio.contains(user)) && (cd.eServicio.get(user).contrasena).equals(password)) {
		ViewEmpleadoServicio ves = new ViewEmpleadoServicio();
		ves.main(args); 
		seguir =false;
	}
	else {System.out.println("\nUsuario o contraseña incorrecta, intente de nuevo");}
	
	
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	}
	else {seguir = false;}
	
	
	}
	}catch(Exception e){
		System.out.println("Hubo un error en el inicio de sesión"); e.printStackTrace();}
	
	System.out.println("Gracias por utilizar nuestro servicio ;)");
	
	scanner.close();
	
	
	
	

}//Closes main function
}//Closes class
