package view;

import java.util.Scanner;
import java.util.Set;

import model.CargaDatos;
import model.CsvEditor;
import model.MenuPrinter;

public class ViewEmpleadoServicio {

	public static void main(String[] args) {
		
		MenuPrinter mp =new MenuPrinter();
		CargaDatos cd = new CargaDatos();
		CsvEditor csv = new CsvEditor();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido Empleado de Servicio\n");
		
		boolean continuar = true;
		while (continuar) {
			System.out.println("Que desea hacer: ");
			mp.menuEmpleadoServicio();
			System.out.println(">");
			
			String eleccion =scanner.nextLine();
			
			
			//ESTO VA A SER UN BLOQUE DE CODIGO RE DENSO SO BUSQUEN EL SIGUIENTE XXXXXXXXXXXXXXX PARA EL SIGUIENTE REQ
			//NO SE ASUSTEN THO, QUE SOLO ESTOY SOLICITANDO MUCHA INFO AL USUARIO PARA REGISRAR A UN CLIENTE
			if(eleccion.equals("1")) {
				
				System.out.println("Escogiste Registrar un cliente, por favor ingrese la siguiente informacion:\n");
				
				Set<String> setUsuariosClientes =cd.clientes.keySet();
				
				
				//Se empieza a solicitar datos
				
				System.out.println("Usuario:\n>");
				String usuario =scanner.nextLine();
				
				if (!(setUsuariosClientes.contains(usuario))) {
				System.out.println("Contraseña:\n>");
				String contrasena =scanner.nextLine();
				
				System.out.println("Nombre:\n>");
				String nombre =scanner.nextLine();
				
				System.out.println("Apellido:\n>");
				String apellido =scanner.nextLine();
				
				System.out.println("Numero Cédula:\n>");
				String numCedula =scanner.nextLine();
				
				System.out.println("Fecha Nacimiento (dd/mm/aa):\n>");
				String fechaNacimiento =scanner.nextLine();
				
				System.out.println("Nacionalidad:\n>");
				String nacionalidad =scanner.nextLine();
				
				System.out.println("Foto Cédula (nombre archivo .jpeg .png ...):\n>");
				String fotoCedula =scanner.nextLine();
				
				System.out.println("Celular:\n>");
				String celular =scanner.nextLine();
				
				System.out.println("Correo:\n>");
				String correo =scanner.nextLine();
				
				System.out.println("Numero Licencia:\n>");
				String numLicencia =scanner.nextLine();
				
				System.out.println("Pais de Expedicion de la Licencia:\n>");
				String paisLicencia =scanner.nextLine();
				
				System.out.println("Fecha de Vencimiento De la Licencia:\n>");
				String vencimientoLicencia =scanner.nextLine();
				
				System.out.println("Foto de la Licencia (nombre archivo .jpeg .png ...):\n>");
				String fotoLicencia =scanner.nextLine();
				
				System.out.println("Nombre en la Tarjeta de Credito:\n>");
				String nombreTarjeta =scanner.nextLine();
				
				System.out.println("Numero de la Tarjeta de Crédito:\n>");
				String numTarjeta =scanner.nextLine();
				
				System.out.println("Foto de la Tarjeta de Crédito:\n>");
				String fotoTarjeta =scanner.nextLine();
				
				System.out.println("¿Está bloqueada la tarjeta? (true/false)\n>");
				String bloqueada =scanner.nextLine();
				
				csv.registrarCliente(usuario, contrasena, nombre, apellido, numCedula, fechaNacimiento, nacionalidad, fotoCedula, celular, correo, numLicencia, paisLicencia, vencimientoLicencia, fotoLicencia, nombreTarjeta, numTarjeta, fotoTarjeta, bloqueada);
				cd.cargarClientes();
				System.out.println("Se registó satisfactoriamente\n");
				
				}
				else {System.out.println("Ya hay un cliente registrado con el usuario" + usuario+ ", por favor intenta de nuevo");}
				
				
				
				
				
				
	
				
			}
			
			
			
			//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
			
			
			else if(eleccion.equals("2")) {
				//Aquí se debe iniciar el codigo para ejecutar el req2
				System.out.println("Escogiste req 2");
				
			}
			else if (eleccion.equals("3")) {
				
				//Aquí se debe iniciar el codigo para ejecutar el req3
				System.out.println("Escogiste req 3");
			}
			else if (eleccion.equals("0")){
				//aquí se cierra el loop y acaba la aplicación
				continuar = false;}
			else {
				//Aquí se reconocer enrrores de input y repite el loop
				System.out.println("Esa no es una de las opciones, intenta de nuevo");}
			
			
			
			
			
		}
		
		scanner.close();
	}

}
