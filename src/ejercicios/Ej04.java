/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 4.Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un triángulo con esas dimensiones.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca tres numeros: ");
		int num1 = teclado.nextInt(),num2 = teclado.nextInt(), num3=teclado.nextInt();
		
		if (num1+num2>num3 && num1+num3>num2 && num2+num3>num1) System.out.println("Es triangulizable.");
		else System.out.println("No es triangulizable");
			
		teclado.close();
	}

}
