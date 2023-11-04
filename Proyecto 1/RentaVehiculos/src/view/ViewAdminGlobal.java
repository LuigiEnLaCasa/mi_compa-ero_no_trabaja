package view;

import java.util.Scanner;
import java.util.Set;

import model.CargaDatos;
import model.MenuPrinter;
import model.CsvEditor;

public class ViewAdminGlobal {

	public static void main(String[] args) {
		
		//instancio clases que usare despues
		MenuPrinter mp =new MenuPrinter();
		Scanner scanner = new Scanner(System.in);
		CargaDatos cd = new CargaDatos();
		CsvEditor csvE = new CsvEditor();
		System.out.println("Bienvenido AdminGlobal\n");
		
		
		
		
		boolean continuar = true;
		while (continuar) {
			//imprimen texto, nada mas
			System.out.println("Que desea hacer: ");
			mp.menuAdminGlobal();
			System.out.println(">");
			
			cd.cargarVehiculos();
			String eleccion =scanner.nextLine();
			
			if(eleccion.equals("1")) {
				
				//Aquí se debe iniciar el codigo para registrar un vehículo nuevo
				
				
				System.out.println("\nPara registrar un nuevo vehículo por favor de los siguentes datos: \n");

				
				System.out.println("1. Placa:");
				String placa = scanner.nextLine();
				
				Set<String> setPlacas =cd.vehiculos.keySet();
				if(!(setPlacas.contains(placa))) {
					
					System.out.println("2. Categoría: ");
					String categoria = scanner.nextLine();
					
					System.out.println("3. Color: ");
					String color = scanner.nextLine();
					
					System.out.println("4. Marca: ");
					String marca = scanner.nextLine();
					
					System.out.println("5. Modelo: ");
					String modelo = scanner.nextLine();
					
					System.out.println("6. Transmision: ");
					String transmision = scanner.nextLine();
					
					System.out.println("7. Capacidad (numero): ");
					String capacidad = scanner.nextLine();
					
					System.out.println("8. Disponibilidad (mantenimiento,disponible,alquilado): ");
					String disponibilidad = scanner.nextLine();
					
					System.out.println("9. Registro: ");
					String registro = scanner.nextLine();
					
					
					
					csvE.registrarVehiculo(categoria,color,marca,modelo,placa,transmision,capacidad,disponibilidad,registro);
					cd.cargarTodo(cd);
					
					
					
				}
				else {System.out.println("Esta placa ya está registrada, intente con otro vehiculo");}
			
			
						
						
						
						
						
			}// cierra el if del req 1
			
			
			else if(eleccion.equals("2")) {
				//Aquí se debe iniciar el codigo para eliminar un vehículo
				System.out.println("Escogiste eliminar un vehiculo, escribe su placa para continuar\n>");
				
				String placaRemover = scanner.nextLine();
				
			
				if (cd.vehiculos.containsKey(placaRemover)) {
		            
					
					cd.vehiculos.remove(placaRemover); 
		            
					csvE.escribirVehiculos(cd.vehiculos, cd.titulosVehiculos);
		            
					cd.cargarVehiculos();
		            
		       
		            System.out.println("El vehiculo con placa "+ placaRemover + " ha sido eliminado.");
		        
				} 
				else {
		            System.out.println("El vehiculo con la placa "+ placaRemover + " no está registrado");
		            
		        }
			
			}
			
			
			
			else if (eleccion.equals("3")) {
				
				//Aquí se debe iniciar el codigo para Escribir nuevo seguro
				System.out.println("Escogiste Registrar Seguro Nuevo:\n");
				
				cd.cargarSeguros();
				
				
				System.out.println("Nombre del seguro que desea Registrar\n>");
				String nombre = scanner.nextLine();
				System.out.println("Precio diario del seguro a registrar\n>");
				String precio = scanner.nextLine();
				
				
				
				csvE.registrarSeguro(nombre, precio);
				cd.cargarSeguros();
			
			System.out.println("El seguro se registró correctamente");
			
			
			
			
			
			
			
			
			}
			
			
			
			else if (eleccion.equals("4")) {
				
				//Aquí se debe iniciar el codigo para eliminar seguro
				System.out.println("Escogiste Eliminar un seguro, porfavor indica su nombre\n>");
				
				cd.cargarSeguros();
				String seguroEliminar = scanner.nextLine();
				
				
				if (cd.tarifasSeguros.containsKey(seguroEliminar)) {
		            
					
					cd.tarifasSeguros.remove(seguroEliminar); 
		            
					csvE.escribirSeguros(cd.tarifasSeguros, cd.titulosSeguros);;
		            
					cd.cargarSeguros();
		            
		       
		            System.out.println("El seguro "+ seguroEliminar + " ha sido eliminado.");
		        
				} 
				else {
		            System.out.println("El seguro "+ seguroEliminar + " no está registrado");
		            
		        }
				
				
				
			}
			
			else if (eleccion.equals("0")){
				//aquí se cierra el loop y acaba la aplicación
				System.out.println("Adios administrador global");
				continuar = false;}
			else {
				//Aquí se reconocer enrrores de input y repite el loop
				System.out.println("Esa no es una de las opciones, intenta de nuevo");}
			
			
			
			
			
		}
		
		scanner.close();
		
		
		
	}

}
