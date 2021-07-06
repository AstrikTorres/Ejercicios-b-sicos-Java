import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("Introduzca su nombre:");
		System.out.println(saludo());
		
		
		
	}

	public static String saludo() {
		String entradaTeclado = "";
		Scanner entradaScanner = new Scanner (System.in);
		entradaTeclado = entradaScanner.nextLine();
		entradaScanner.close();
		return "Hola, " + entradaTeclado;
	}
	
}
