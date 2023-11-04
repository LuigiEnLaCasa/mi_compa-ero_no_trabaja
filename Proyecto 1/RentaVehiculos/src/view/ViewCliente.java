package view;

import java.util.Scanner;

import model.MenuPrinter;
public class ViewCliente {

	public static void main(String[] args) {
		
		MenuPrinter mp =new MenuPrinter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido Cliente\n");
		
		boolean continuar = true;
		while (continuar) {
			System.out.println("Que desea hacer: ");
			mp.menuCliente();;
			System.out.println(">");
			
			String eleccion =scanner.nextLine();
			
			if(eleccion.equals("1")) {
				//Aquí se debe iniciar el codigo para ejecutar el primer req
				System.out.println("Escogiste req 1");}
			
			else if (eleccion.equals("0")){
				//aquí se cierra el loop y acaba la aplicación
				continuar = false;}
			else {
				//Aquí se reconocer enrrores de input y repite el loop
				System.out.println("Esa no es una de las opciones, intenta de nuevo");
				}
			}
			
		scanner.close();

}
}