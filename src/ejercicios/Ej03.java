/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 3.Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la posición central si los tres se 		ordenasen.  
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca tres numeros: ");
		int num1 = teclado.nextInt(),num2 = teclado.nextInt(), num3=teclado.nextInt();
		
		if (num1<num2 && num2<num3 || num1>num2 && num2>num3) System.out.printf("%d es el de en medio",num2);
		else if (num2<num1 && num1<num3 || num2>num1 && num1>num3) System.out.printf("%d es el de en medio",num1);
		else if (num1<num3 && num3<num2 || num1>num3 && num3>num2) System.out.printf("%d es el de en medio", num3);
		else System.out.println("Error al introducir los datos.");
		teclado.close();
	}

}
