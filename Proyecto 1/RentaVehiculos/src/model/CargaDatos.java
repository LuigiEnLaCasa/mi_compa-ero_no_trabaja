package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import controller.Reserva;
import model.EmpleadoMantenimiento;
import model.EmpleadoServicio;

import java.util.ArrayList;

public class CargaDatos {
	
	public HashMap<String, AdminGlobal> aGlobales = new HashMap<String, AdminGlobal>() ;
	public HashMap<String, AdminLocal> aLocales = new HashMap<String, AdminLocal>() ;
	public HashMap<String,Cliente> clientes= new HashMap<String, Cliente>() ;
	public HashMap<String,EmpleadoServicio> eServicio= new HashMap<String, EmpleadoServicio>() ;
	public HashMap <String, EmpleadoMantenimiento> eMantenimiento= new HashMap<String, EmpleadoMantenimiento>() ;
	
	
	public HashMap <String, Vehiculo> vehiculos= new HashMap<String, Vehiculo>() ;
	public HashMap <String, HashMap<String,Integer>> tarifasCategoria= new HashMap<>() ;
	public HashMap <String, Integer> tarifasSeguros= new HashMap<String, Integer>() ;
	
	
	
	public String titulosVehiculos ;
	public String titulosSeguros;
	public String titulosEmpleados;
	
	
	//Methods
	
 	public void cargarAdminGlobales() {
		try {
			
			BufferedReader lector = new BufferedReader(new FileReader("DATA/usuarios/aGlobales.csv"));
			
			String titulos  = (lector.readLine());
			this.titulosSeguros = titulos;
			
			String linea;
			while ( (linea = lector.readLine()) != null ) {
				
				AdminGlobal aG = new AdminGlobal();
				
				String[] info = linea.split(",");
				
				String usuario = info[0].trim();
				String contrasena = info[1].trim();
				int documento = Integer.parseInt(info[2].trim());
				
				aG.setUsuario(usuario);
				aG.setContrasena(contrasena);
				aG.setDocumento(documento);
				
				aGlobales.putIfAbsent(usuario, aG);
				
				
				
				
			}
			lector.close();
			
		}catch(Exception e ) {System.out.println("Hubo un error en la carga Admin Globales"); e.printStackTrace();}
		
		
		
		
		
		
	}
	
	public void cargarAdminLocales() {
		
		
		try {
			
			BufferedReader lector = new BufferedReader(new FileReader("DATA/usuarios/aLocales.csv"));
			
			String[] titulos  = (lector.readLine()).split(",");
			
			String linea;
			while ( (linea = lector.readLine()) != null ) {
				
				AdminLocal aL = new AdminLocal();
				
				String[] info = linea.split(",");
				
				String usuario = info[0].trim();
				String contrasena = info[1].trim();
				String sede = info[2].trim();
				int documento = Integer.parseInt(info[3].trim());
				
				aL.setUsuario(usuario);
				aL.setContrasena(contrasena);
				aL.setSede(sede);
				aL.setDocumento(documento);
				
				aLocales.putIfAbsent(usuario, aL);
					
			}
			lector.close();
			
		}catch(Exception e ) {System.out.println("Hubo un error en la carga Admin Locales"); e.printStackTrace();}
		
		
	}
	
	public void cargarClientes() {
		
	try {
			
			BufferedReader lector = new BufferedReader(new FileReader("DATA/usuarios/clientes.csv"));
			
			String[] titulos  = (lector.readLine()).split(",");
			
			String linea;
			while ( (linea = lector.readLine()) != null ) {
				
				//Iniciializacion tipos
				Cliente c = new Cliente();
				Cedula cd = new Cedula();
				TarjetaCredito tc = new TarjetaCredito();
				Licencia l = new Licencia();
				//XXXXXXXXXXXXXX
				
				String[] info = linea.split(",");
				
				String usuario = info[0].trim();
				String contrasena = info[1].trim();
				
				//datos personales (van en la cedula)
				String nombre = info[2].trim();
				String apellido = info[3].trim();
				int numCedula = Integer.parseInt(info[4].trim());
				String fechaNacimiento= info[5].trim(); //Esto es una fecha, puede cambiar a tipo date en el futuro
				String nacionalidad = info[6].trim();
				String fotoCedula = info[7].trim(); //esto es una foto, el formato debe ser definido después.
				
				// datos contacto
				int celular = Integer.parseInt(info[8].trim());
				String correo = info[9].trim();
				
				//datos licencia
				int numLicencia = Integer.parseInt(info[10].trim());
				String paisLicencia= info[11].trim();
				String vencimientoLicencia= info[12].trim(); //Esto es una fecha, puede cambiar a tipo date en el futuro
				String fotoLicencia = info[13].trim();//esto es una foto, el formato debe ser definido después.
				// datos tarjeta de credito
				String nombreTarjeta= info[14].trim();
				int tarjetaNumero = Integer.parseInt(info[15].trim());
				String fotoTarjeta = info[16].trim();
				boolean bloqueada = Boolean.parseBoolean(info[17].trim());
				
		
				//seteo cedula
				cd.setNombre(nombre);
				cd.setApellido(apellido);
				cd.setNumCedula(numCedula);
				cd.setNacionalidad(nacionalidad);
				cd.setfechaNacimiento(fechaNacimiento);
				cd.setFotoCedula(fotoCedula);
				//seteo licencia
				l.setNumLicencia(numLicencia);
				l.setPaisLicencia(paisLicencia);
				l.setFechaVencimietno(vencimientoLicencia);
				l.setFotoLicencia(fotoLicencia);
				//seteo Tarjeta de Credito
				tc.setNombreTarjeta(nombreTarjeta);
				tc.setNumeroTarjeta(tarjetaNumero);
				tc.setFotoTarjeta(fotoTarjeta);
				tc.setEstatusBloqueada(bloqueada);
				
				//SETEO CLIENTE
				c.setUsuario(usuario);
				c.setContrasena(contrasena);
				c.setCelular(celular);
				c.setCorreo(correo);
				c.setCedula(cd);
				c.setTarjetaCredito(tc);
				
				
				
			
				
				clientes.putIfAbsent(usuario, c);
				
				
				
				
			}
			lector.close();
			
		}catch(Exception e ) {System.out.println("Hubo un error en la carga Clientes"); e.printStackTrace();}
		
		
		
		
		
		
		
		
	}
	
	public void cargarEmpleados() {
		try {
			
			BufferedReader lector = new BufferedReader(new FileReader("DATA/usuarios/empleados.csv"));
			
			String  titulos  = lector.readLine();
			this.titulosEmpleados = titulos ;
			
			
			String linea;
			while ( (linea = lector.readLine()) != null ) {
				
				
				
				
				String[] info = linea.split(",");
				
				String usuario = info[0].trim();
				String contrasena = info[1].trim();
				String nombre = info[2].trim();
				String apellido = info[3].trim();
				int id = Integer.parseInt(info[4].trim());
				String sede = info[5].trim();
				String tipoEmpleado =  info[6].trim();
				
				
				
				
				if(tipoEmpleado.equals("mantenimiento")) {
					
					EmpleadoMantenimiento em = new EmpleadoMantenimiento();
					
					em.setUsuario(usuario);
					em.setContrasena(contrasena);
					em.setNombre(nombre);
					em.setApellido(apellido);
					em.setNumId(id);
					em.setSede(sede);
					em.setTipoEmpleado(tipoEmpleado);
					
					eMantenimiento.putIfAbsent(usuario, em);
					
					
					
				} else if (tipoEmpleado.equals("servicio")) {
					EmpleadoServicio es = new EmpleadoServicio();
					
					
					
					es.setUsuario(usuario);
					es.setContrasena(contrasena);
					es.setNombre(nombre);
					es.setApellido(apellido);
					es.setNumId(id);
					es.setSede(sede);
					es.setTipoEmpleado(tipoEmpleado);
					
					eServicio.putIfAbsent(usuario, es);
					
				} else {System.out.println("hay un dato erroneo de tipo de empleado");}

				
				
				
				
			}
			lector.close();
			
		}catch(Exception e ) {System.out.println("Hubo un error en la carga Admin Globales"); e.printStackTrace();}
		
		
		
		
		
		
	}
	
	//ESTE METODO ES FUNDAMENTAL HACE TODOS EN UNO
	public void cargarTodo(CargaDatos cd) {
				
		cd.cargarAdminGlobales();
		cd.cargarAdminLocales();
		cd.cargarClientes();
		cd.cargarEmpleados();
		
		cd.cargarVehiculos();
		cd.cargarTarifas();
		cd.cargarSeguros();
		
	}
	
	
	
	public void cargarVehiculos() {
		
		try {
		
		BufferedReader lector = new BufferedReader(new FileReader("DATA/inventario/vehiculos.csv"));
		
		
		
		String titulos  = (lector.readLine());
		this.titulosVehiculos = titulos;
		
		String linea;
		while ( (linea = lector.readLine()) != null ) {
			
			Vehiculo v = new Vehiculo();
			
			
			String[] info = linea.split(",");
			
			String categoria = info[0].trim();
			String color = info[1].trim();
			String marca = info[2].trim();
			String modelo = info[3].trim();
			String placa = info[4].trim();
			String transmision = info[5].trim();
			int capacidad =  Integer.parseInt(info[6].trim());
			String disponibilidad =  info[7].trim();
			String registro =  info[8].trim();
			
			
			
			v.setCategoria(categoria);
			v.setColor(color);
			v.setMarca(marca);
			v.setModelo(modelo);
			v.setPlaca(placa);
			v.setTransmision(transmision);
			v.setCapacidad(capacidad);
			v.setDisponibilidad(disponibilidad);
			v.setRegistro(registro);
			
				
			vehiculos.put(placa, v);
			
			} 
		lector.close();
		}catch(Exception e) {System.out.println("Hubo un error en la carga de vehiculos"); e.printStackTrace();}
	
		
	}
	


	public void cargarTarifas(){
		
		
	try {
			
			BufferedReader lector = new BufferedReader(new FileReader("DATA/tarifas/tarifas.csv"));
			
			
			
			String[] titulos  = (lector.readLine()).split(",");
			
			String linea;
			while ( (linea = lector.readLine()) != null ) {
				
				HashMap<String, Integer> mapaInterno = new HashMap<>();
				
				String[] info = linea.split(",");
				
				String categoria = info[0].trim();
				int tarifaCategoria = Integer.parseInt(info[1].trim());
				int tarifaAlta = Integer.parseInt(info[2].trim());
				int tarifaBaja = Integer.parseInt(info[3].trim());
				int tarifaSedeAjena = Integer.parseInt(info[4].trim());
				int adicionalConductor = Integer.parseInt(info[5].trim());
				
				mapaInterno.put("tarifaCategoria",tarifaCategoria);
				mapaInterno.put("tarifaAlta", tarifaAlta);
				mapaInterno.put("tarifaBaja", tarifaBaja);
				mapaInterno.put("tarifaSedeAjena", tarifaSedeAjena);
				mapaInterno.put("adicionalConductor", adicionalConductor);
				
				tarifasCategoria.put(categoria, mapaInterno);
				
				

				
				
				
				
			}
			lector.close();
			
		}catch(Exception e ) {System.out.println("Hubo un error en la carga de Tarifas por categoria "); e.printStackTrace();}
		
		
		
		
		
	}




public void cargarSeguros() {
	
	try {
		
		BufferedReader lector = new BufferedReader(new FileReader("DATA/tarifas/tarifaSeguros.csv"));
		
		String titulos  = lector.readLine();
		this.titulosSeguros = titulos;
		
		String linea;
		while ( (linea = lector.readLine()) != null ) {
			
			
			String[] info = linea.split(",");
			
			String seguro= info[0].trim();
			int tarifaSeguro = Integer.parseInt(info[1].trim());

			
			tarifasSeguros.put(seguro,tarifaSeguro );
				
			
		}
		lector.close();
		
	}catch(Exception e ) {System.out.println("Hubo un error en la carga de seguros "); e.printStackTrace();}
	
	
	
}







public void usuarioDisponible(String user) {}//una funcion que revise todos los maps de usuarios para verificar que ninguno coincida y se pueda registar.



}