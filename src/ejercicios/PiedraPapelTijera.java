/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class PiedraPapelTijera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Pedir al usuario que elija entre piedra papel y tijera y se enfrente a un resultado aleatorio generado con la maquina
		
		Scanner teclado = new Scanner (System.in);
		int cont = 0;
		
	//	System.out.println("1- Piedra\n2- Papel\n3- Tijera: ");
	//	int usuario = teclado.nextInt();
	
	//	int maquina = (int) Math.random()*3+1;
		
		do {
		
			System.out.println("1- Piedra\n2- Papel\n3- Tijera: ");
			int usuario = teclado.nextInt();
		
			int maquina = (int) (Math.random()*3+1);
		
		switch (usuario) {
			case 1:
				switch (maquina) {
				case 1:
					System.out.println("Empate.");
					break;
				case 2:
					System.out.println("Perdiste.");
					break;
				case 3:
					System.out.println("Ganaste.");
					break;
				} break;
			case 2:
				switch (maquina) {
				case 1:
					System.out.println("Ganaste.");
					break;
				case 2:
					System.out.println("Empate.");
					break;
				case 3:
					System.out.println("Perdiste.");
					break;
				} break;
			case 3:
				switch (maquina) {
				case 1:
					System.out.println("Perdiste.");
					break;
				case 2:
					System.out.println("Ganaste.");
					break;
				case 3:
					System.out.println("Empate.");
					break;
				} break;
				default:
				System.out.println("EROR: entrada incorrecta.");
		}
		System.out.println(usuario + "|" + maquina);
		cont = cont +1;
		} while (cont<=3);
		teclado.close();
		
	}

}
