/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 1.Algoritmo  que  pida  dos  enteros  y  que  indique  el  mayor  y  el  menor,  o  si  ambos  son  iguales. 
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca dos numeros: ");
		int num1 = teclado.nextInt(),num2 = teclado.nextInt();
		if (num1>num2) System.out.printf("%d es mayor que %d.", num1,num2);
		else if (num1<num2) System.out.printf("%d es menor que %d.", num1,num2);
		else System.out.printf("%d es igual que %d.", num1,num2);
		
		teclado.close();
	}

}
