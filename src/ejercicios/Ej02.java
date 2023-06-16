/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 2.Algoritmo que pida 3 números e indique cual es el menor de los tres.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca tres numeros: ");
		int num1 = teclado.nextInt(),num2 = teclado.nextInt(), num3=teclado.nextInt();
		
		if (num1<=num2 && num2<=num3) System.out.printf("%d es el menor",num1);
		else if (num1>=num2 && num2>=num3) System.out.printf("%d es el menor",num3);
		else System.out.printf("%d es el menor", num2);
		
		teclado.close();
	}

}
