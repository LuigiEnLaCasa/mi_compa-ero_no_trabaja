package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.BufferedWriter;

public class CsvEditor {
	
	

		
		
		public void registrarVehiculo(String categoria , String color, String marca, String modelo, String placa,String transmision, String capacidad, String disponibilidad,String registro) {
		
		
		String filePath = "DATA/inventario/vehiculos.csv";
		String a =  categoria + "," + color + ","  +  marca + "," + modelo+ "," + placa+ "," +  transmision+ "," +  capacidad + "," + disponibilidad+ "," + registro;
				
				
				try {
					 FileWriter fileWriter = new FileWriter(filePath, true);
			         PrintWriter printWriter = new PrintWriter(fileWriter);

			            // Append the string as a new line at the end of the file
			            printWriter.println(a);

			            // Close the writers
			            printWriter.close();
			            fileWriter.close();
					
					
				}catch(Exception e){System.out.println("Hubo un problema escribiendo en la ultima linea de vehiculos");}

		}

		
		
		public void escribirVehiculos(HashMap<String,Vehiculo> mapVehiculos, String titulos) {
			
			//Esta funcion escribe los vehiculos del hashmap en el csv. Lo utilixé para los reqs de eliminar, (eliminando primero del hash), pero puede ser util en otro contexto
			
			try {
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("DATA/inventario/vehiculos.csv"));

		         //Escribe los titulos al inicio del archivo
		           writer.write(titulos);
		           
		            Set<String> placas =  mapVehiculos.keySet();
				 
		            
		           for (String placa : placas ) {
			           
					 
					
					 String plate = mapVehiculos.get(placa).placa;
					 String categoria =mapVehiculos.get(placa).categoria;
					 String color = mapVehiculos.get(placa).color;
					 String marca = mapVehiculos.get(placa).marca;
					 String modelo = mapVehiculos.get(placa).modelo;
					 String transmision = mapVehiculos.get(placa).transmision;
					 String capacidad = Integer.toString(mapVehiculos.get(placa).capacidad);
					 String disponibilidad = mapVehiculos.get(placa).disponibilidad;
					 String registro = mapVehiculos.get(placa).registro;
					 

					 
					 String cadenaComas =  categoria + "," + color + "," + marca + "," + modelo + "," + plate + "," +  transmision + "," + capacidad +","+ disponibilidad + "," + registro ;
					 writer.newLine();
					 writer.write(cadenaComas);
			            
			         
			            
				 
				 }
				    writer.newLine();
		            
		            writer.close();
				
				
			}catch(Exception e){System.out.println("Escribir vehiculos tuvo un error"); e.printStackTrace();}

			
			
		}//Este req va a iterar el hashmap y va a eliminar un carro al reescribir el archivo pero skippeando el de la placa ue dijo el man
		

		
		public void registrarSeguro(String nombre, String precio) {
			
			String filePath = "DATA/tarifas/tarifaSeguros.csv";
			String a =  nombre + "," + precio ;
					
					try {
						 FileWriter fileWriter = new FileWriter(filePath, true);
				         PrintWriter printWriter = new PrintWriter(fileWriter);

				            // Append the string as a new line at the end of the file
				            printWriter.println(a);

				            // Close the writers
				            printWriter.close();
				            fileWriter.close();
						
						
					}catch(Exception e){System.out.println("Hubo un problema escribiendo en la ultima linea de seguros");}

			}

			
	
public void escribirSeguros(HashMap<String,Integer> mapSeguros , String titulos) {
	
	//Esta funcion se dedica a escribir los seguros que haya en un map, pero 
	
	try {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("DATA/tarifas/tarifaSeguros.csv"));

         //Escribe los titulos al inicio del archivo
           writer.write(titulos);
           
            Set<String> nombresSeguros =  mapSeguros.keySet();
		 
            
           for (String nombreSeguro : nombresSeguros) {
	           
			 
			
			 
			 String valor = Integer.toString(mapSeguros.get(nombreSeguro));


			 
			 String cadenaComas =  nombreSeguro + "," + valor ;
			 writer.newLine();
			 writer.write(cadenaComas);
	            
	         
	            
		 
		 }
		    writer.newLine();
            
            writer.close();
		
		
	}catch(Exception e){System.out.println("Escribir vehiculos tuvo un error"); e.printStackTrace();}

	
	
	
}





public void registrarCliente(String usuario,String contrasena,String nombre, String apellido,String numCedula,String fechaNacimiento,String nacionalidad, String fotoCedula,String celular,String correo,String numLicencia, String paisLicencia,String vencimientoLicencia,String fotoLicencia,String nombreTarjeta,String numTarjeta,String fotoTarjeta,String bloqueada
) {
	
	
	
	String filePath = "DATA/usuarios/clientes.csv";
	String a =  usuario + "," + contrasena + "," + nombre + "," + apellido + "," + numCedula + "," + fechaNacimiento + "," + nacionalidad + "," + fotoCedula + "," + celular + "," + correo + "," + numLicencia + "," + paisLicencia + "," + vencimientoLicencia + "," + fotoLicencia + "," + nombreTarjeta + "," + numTarjeta + "," + fotoTarjeta + "," + bloqueada
 ;
			
			try {
				 FileWriter fileWriter = new FileWriter(filePath, true);
		         PrintWriter printWriter = new PrintWriter(fileWriter);

		            // Append the string as a new line at the end of the file
		            printWriter.println(a);

		            // Close the writers
		            printWriter.close();
		            fileWriter.close();
				
				
			}catch(Exception e){System.out.println("Hubo un problema escribiendo en la ultima linea de clientes");}

}




public void registrarEmpleado(String usuario,String contrasena,String nombre,String apellido,String id,String sede,String typeEmpleado) {
	
	
	
	
	
	String filePath = "DATA/usuarios/empleados.csv";
	String a =  usuario + "," + contrasena + "," + nombre + "," + apellido + "," + "," + id + ","+ sede + "," + typeEmpleado
 ;
			
			try {
				 FileWriter fileWriter = new FileWriter(filePath, true);
		         PrintWriter printWriter = new PrintWriter(fileWriter);

		            // Append the string as a new line at the end of the file
		            printWriter.println(a);

		            // Close the writers
		            printWriter.close();
		            fileWriter.close();
				
				
			}catch(Exception e){System.out.println("Hubo un problema escribiendo en la ultima linea de clientes");}

	
	
}





public void escribirEmpleados(HashMap<String, EmpleadoServicio> eServicio,HashMap<String, EmpleadoMantenimiento> eMantenimiento,String titulos) {
	
	
try {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("DATA/usuarios/empleados.csv"));

         //Escribe los titulos al inicio del archivo
           writer.write(titulos);
           
            Set<String> usuariosServicio =  eServicio.keySet();
           
		 
            //loop que inscribe a los usuarios de servicio
           for (String usuarioS : usuariosServicio) {
	           
			String contrasena = eServicio.get(usuarioS).contrasena;
			String nombre = eServicio.get(usuarioS).nombre;
			String apellido = eServicio.get(usuarioS).apellido;
			String id = Integer.toString(eServicio.get(usuarioS).numId);
			String sede = eServicio.get(usuarioS).sede;
			String tipoEmpleado = eServicio.get(usuarioS).tipoEmpleado;
			
			

			 
			 String cadenaComas =  usuarioS + ","+  contrasena + ","+ nombre + ","+ apellido + ","+ id + ","+ sede + ","+  tipoEmpleado ;
			 writer.newLine();
			 writer.write(cadenaComas);
      		 
		 }
           
           
           
           Set<String> usuariosMantenimiento = eMantenimiento.keySet();
           //loop que escribe a los usuarios de mantenimiento
           for (String usuarioM : usuariosMantenimiento) {
	           
			String contrasena = eServicio.get(usuarioM).contrasena;
			String nombre = eServicio.get(usuarioM).nombre;
			String apellido = eServicio.get(usuarioM).apellido;
			String id = Integer.toString(eServicio.get(usuarioM).numId);
			String sede = eServicio.get(usuarioM).sede;
			String tipoEmpleado = eServicio.get(usuarioM).tipoEmpleado;
			
			

			 
			 String cadenaComas =  usuarioM + ","+  contrasena + ","+ nombre + ","+ apellido + ","+ id + ","+ sede + ","+  tipoEmpleado ;
			 writer.newLine();
			 writer.write(cadenaComas);
      		 
		 }
           
           
		    writer.newLine();
            
            writer.close();
		
		
	}catch(Exception e){System.out.println("Escribir vehiculos tuvo un error"); e.printStackTrace();}
}




}


