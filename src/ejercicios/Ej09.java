/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 9.Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo que calcule los impuestos que debe pagar según 		la siguiente tabla de tramos:  Tramo Impuesto (%) Descuento 0 a 1000 0 No aplicable 1000 a 1600 5 1% por hijo (máximo 10%) 1600 a 3000 		10 1% por hijo (máximo 10%) 3000 a 4600 15 1% por hijo (máximo 10%) > 4600 20 1.5% por hijo (máximo 15%) 
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el sueldo del trabajador: ");
		double sueldo = teclado.nextFloat();
		
		System.out.println("Introduzca el número de hijos: ");
		double hijos = teclado.nextInt();
		double impuesto=0;
		double total=0;
		double descuento=0;
		
		if (sueldo<=1000){
			System.out.println("No le corresponde pagar impuestos.");
			System.exit(0);
		} else if (1000<sueldo && sueldo<=1600) {
			impuesto=0.05;
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
		} else if (1600< sueldo && sueldo<=3000) {
			impuesto=0.1;
			if (hijos>10) {descuento=1-0.1;} 
			else {descuento=(1-(hijos/100));}
		} else if (3000<sueldo && sueldo<=4600) {
			impuesto=0.15;
			if(hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
		} else if (sueldo>4600) {
			impuesto=0.2;
			if(hijos>10) {descuento=1-0.15;}
			else {descuento=(1-((1.5*hijos)/100));}
		}
		
		total=sueldo*impuesto*descuento;
		
		System.out.printf("Con un sueldo de %.2f le corresponde pagar %.2f de impuestos.",sueldo,total);
		
		//System.out.println(total+ "| "+sueldo+ " |"+impuesto+ "| "+descuento+ "| "+hijos);
		
		teclado.close();
	}

}
