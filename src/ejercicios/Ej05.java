/**
 * 
 */
package ejercicios;

import java.util.Scanner;
/**
 * @author Alejandro
 *
 */
public class Ej05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 5.Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar si están en la misma fila, columna, o en 		la misma diagonal. 
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca una casilla: ");
		char letra1 = teclado.next().charAt(0);
		int fila1 = teclado.nextInt();
		 
		System.out.println("Introduzca una casilla: ");
		char letra2 = teclado.next().charAt(0);
		int fila2 = teclado.nextInt();
		
		int columna1 = (Character.toUpperCase(letra1)-'A')+1;
		int columna2 = (Character.toUpperCase(letra2)-'A')+1;
		
		if ((columna1>8 || columna1<1) || (columna2>8 || columna2<1) || (fila1>8 || fila1<1) || (fila2>8 || fila2<1))
			System.out.println("ERROR: Datos fuera del tablero.");
		else if (fila1==fila2) 
			System.out.println("Están en la misma fila.");
		else if (columna1==columna2) 
			System.out.println("Están en la misma columna.");
		else if ((fila1==fila2) && (columna1==columna2)) 
			System.out.println("Son la misma casilla.");
		else if ((Math.abs(columna2-columna1)) == (Math.abs(fila1-fila2))) 
			System.out.println("Están en la misma diagonal.");
		else
			System.out.println("No están ni en la misma fila, columna o diagonal");
		
		teclado.close();
	}

}
