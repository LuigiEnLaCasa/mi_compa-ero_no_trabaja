package view;

//ESTE ARCHIVO ES CARRETA, LO ESTABA USANDO PARA HACER EXPERIMENTOS
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class main {

	public static void main(String[] args) {
	
		try{
		BufferedWriter writer = new BufferedWriter(new FileWriter("DATA/tarifas/prueba.csv"));
		writer.newLine();
		writer.write("seguro,tarifaDiaria");
	
		
		writer.close();
		} catch(Exception e) {System.out.println("Hubo un error en el buffered writer");}
		
		
		
		
		
		
		
		

	}
}
