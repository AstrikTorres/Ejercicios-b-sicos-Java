import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println ("Introduzca su nombre:");
		 String entradaTeclado = "";
		//Creación de un objeto Scanner
		 Scanner entradaEscaner = new Scanner (System.in);
		//Invocamos un método sobre un objeto Scanner
	     entradaTeclado = entradaEscaner.nextLine();
	     System.out.println ("Bienvenido " + entradaTeclado);
	     entradaEscaner.close();
	}

}
