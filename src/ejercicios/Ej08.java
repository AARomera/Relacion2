/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 	8.Escribir  un  programa  que  implemente  una  pequeña  calculadora  con  switch-case.  El  programa pedirá al usuario los 		operandos (a y b) y la operación a realizar: suma, resta, multiplicación,   división,  raíz cuadrada del primer número y elevar el 		primer número al segundo.  En  función  de  la  opción  seleccionada  se  realizará  una  de  las  operaciones  aritméticas. 
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el primer valor: ");
		double num1 = teclado.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		double num2 = teclado.nextDouble();
		System.out.println("Seleccione el tipo de operacion:\n"
				+ "-Pulse 1 para suma\n-Pulse 2 para resta\n"
				+ "-Pulse 3 para multiplicar\n"
				+ "-Pulse 4 para dividir\n"
				+ "-Pulse 5 para la raíz cuadrada\n"
				+ "-Pulse 6 para la potencia ");
		
		int operador = teclado.nextInt();
		double resultado=Double.NaN;
		
		switch (operador) {
			case 1:
				resultado = num1+num2;
				break;
			case 2:
				resultado = num1-num2;
				break;
			case 3:
				resultado = num1*num2;
				break;
			case 4:
				resultado = num1/num2;
				break;
			case 5:
				resultado = Math.sqrt(num1);
				break;
			case 6:
				resultado = Math.pow(num1, num2);
				break;
			default:
				System.out.println("ERROR: Operador erroneo");				
		}
		if (Double.isNaN(resultado)) 
			System.out.println("ERROR");
		 else 
			System.out.printf("El resultado es %f", resultado);	
		
		teclado.close();
	}

}
