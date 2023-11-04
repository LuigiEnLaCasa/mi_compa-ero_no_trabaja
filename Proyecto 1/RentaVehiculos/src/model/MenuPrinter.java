package model;

public class MenuPrinter {

	
	public void menuAdminGlobal() {
		
		System.out.println("1- Registrar Vehiculo Nuevo"); 
		System.out.println("2- Eliminar Vehiculos"); 
		System.out.println("3- Registrar Seguro Nuevo");
		System.out.println("4- Eliminar Seguro");
		System.out.println("0- Cerrar Sesion");
	}
	
	public void menuAdminLocal() {
		System.out.println("1- Registrar Empleado Nuevo"); 
		System.out.println("2- Eliminar Empleado de la Sede"); 
		System.out.println("0- Cerrar Sesion");

		
	}
	public void menuCliente() {
		System.out.println("1- Hacer Reserva"); 
		System.out.println("0- Cerrar Sesion");

		
	}
	public void menuEmpleadoServicio() {
		System.out.println("1- Registrar Cliente"); 
		System.out.println("2- Alquilar Vehículo");
		System.out.println("3- Ofrecer Seguros");
		System.out.println("4- Hacer Factura");
		System.out.println("0- Cerrar Sesion");
	}
	public void menuEmpleadoMantenimiento() {
		
		System.out.println("1- Limpiar Vehículo"); 
		System.out.println("2- Hacer mantenimiento"); //Este requerimiento debe calcular el tiempo en el que el carro estará disponible 
		System.out.println("0- Cerrar Sesion");
		
	}
}
