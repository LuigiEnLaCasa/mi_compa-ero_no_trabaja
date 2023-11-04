package view;
import java.util.Scanner;
import java.util.Set;

import model.CargaDatos;
import model.CsvEditor;

//PARA PROBAR ADECUADAMENTE ESTE VIEW, DEBEN CORRERLO DESDE EL INICIO DE SESION, PUES ES AHÍ DONDE SE DEFINE CUAL ES LA SEDE DONDE EL USUARIO TIENE PODER

import model.MenuPrinter;

public class ViewAdminLocal {
	
	private static String sede;//Este atributo es importante para saber de donde es el admin y donde tiene poder

	
	public static void main(String[] args) {
				
		MenuPrinter mp =new MenuPrinter();
		CargaDatos cd = new CargaDatos();
		Scanner scanner = new Scanner(System.in);
		CsvEditor csv = new CsvEditor();
		System.out.println("Bienvenido AdminLocal de la sede "+ (sede) + "\n");
		
		cd.cargarEmpleados();
		
		boolean continuar = true;
		while (continuar) {
			System.out.println("Que desea hacer: ");
			mp.menuAdminLocal();
			System.out.println(">");
			
			String eleccion =scanner.nextLine();
			
			
			
			if(eleccion.equals("1")) {
				//Aquí se debe iniciar el codigo para ejecutar el primer req
				System.out.println("Escogiste Registrar Empleado de la sede "+sede);
				System.out.println("Por favor ingrese los siguientes datos\n>");
				
				System.out.println("Usuario: ");
				String usuario = scanner.nextLine();
			
				
				Set<String> setMantenimiento =cd.eMantenimiento.keySet();
				Set<String> setServicio = cd.eServicio.keySet();
				
				if(!(setMantenimiento.contains(usuario)) && !(setServicio.contains(usuario))) {
				
					
				System.out.println("Contraseña: ");
				String contrasena = scanner.nextLine();
				
				System.out.println("Nombre: ");
				String nombre = scanner.nextLine();
				
				System.out.println("Apellido: ");
				String apellido = scanner.nextLine();
				
				System.out.println("Id de la empresa: ");
				String id = scanner.nextLine();
				
				System.out.println("Tipo de empleado: (mantenimiento,servicio)");
				String typeEmpleado = scanner.nextLine();
				
				
				csv.registrarEmpleado(usuario, contrasena, nombre, apellido, id, sede ,typeEmpleado);
				cd.cargarEmpleados();
				
				}
				else {System.out.println("Este usuario ya existe, intente de nuevo"); }
			
			
			
			
			
			
			
			}
			
			
			
			else if(eleccion.equals("2")) {
				//Aquí se debe iniciar el codigo para ejecutar el req2
				System.out.println("Escogiste Eliminar un Empleado, ingrese su usuario para eliminar\n>");
				
				String usuarioRemover = scanner.nextLine();
				
				
				
				Set<String> setMantenimiento =cd.eMantenimiento.keySet();
				Set<String> setServicio = cd.eServicio.keySet();
				
				//Bloque de condicionales inicia
				
				if ((setMantenimiento.contains(usuarioRemover))) {
					System.out.println("Este usuario Si pertenece a tu sede y vamos a eliminarlo");
					//IF INTERIOR
					if(sede.equals(cd.eMantenimiento.get(usuarioRemover).sede)) {
					
						//se confirma que pertenece a los empleados y ahora se procede a eliminar
					cd.eMantenimiento.remove(usuarioRemover);
					csv.escribirEmpleados(cd.eServicio,cd.eMantenimiento, cd.titulosEmpleados);
					cd.cargarEmpleados();
					
					System.out.println("El empleado se eliminó correctamente\n");
				
					}else {System.out.println("Este usuario no pertenece a tu sede");}
					
				
				}
				else if((setServicio.contains(usuarioRemover))) {
					
					if (sede.equals(cd.eServicio.get(usuarioRemover).sede)) {
						
						System.out.println("Este usuario Si pertenece a tu sede y vamos a eliminarlo");
						// se confirama que el usuario pertenece a los empleados de servicio y se procede a eliminar
						
						cd.eServicio.remove(usuarioRemover);
						csv.escribirEmpleados(cd.eServicio,cd.eMantenimiento, cd.titulosEmpleados);
						cd.cargarEmpleados();
						
						System.out.println("El empleado se eliminó correctamente\n");
						
					}else {System.out.println("Este usuario no pertenece a tu sede");}
					
					
				
						
					}else {System.out.println("Este usuario no parece estar registrado");}
					
				
				
				
		
				
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

	
	
	public void setSede(String sede) {this.sede=sede;}
	private String getSede() {return this.sede;}
}
