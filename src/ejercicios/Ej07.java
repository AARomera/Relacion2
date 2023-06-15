/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 7.Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta que son años bisiestos los múltiplos de 4, excepto 		los que son también múltiplos de 100 pero no lo son de 400. 
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un año: ");
		int anio = teclado.nextInt();
		
		if (anio%4==0) {
			if(anio%100==0 && anio%400!=0) {
				System.out.println("No es bisiesto.");
			}else {
				System.out.println("Es bisiesto.");
			}
		} else { System.out.println("No es bisiesto.");
		}
		teclado.close();
	}

}
