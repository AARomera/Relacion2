/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej9_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el sueldo del trabajador: ");
		double sueldo = teclado.nextFloat();
		
		System.out.println("Introduzca el número de hijos: ");
		double hijos = teclado.nextInt();
		double impuesto=1;
		double total=0;
		double descuento=0;
		double subSueldo=sueldo;
		
		if (sueldo<=1000) {
			System.out.println("No le corresponde pagar impuestos.");
			System.exit(0);
		}
		subSueldo=subSueldo-1000;
		if(subSueldo<=0) impuesto=0;
		
		if (sueldo<=1600){
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
			total=total+subSueldo*0.05*descuento*impuesto;
		} else {
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
			total=total+600*0.05*descuento*impuesto;
		}
		
		subSueldo=subSueldo-600;
		if(subSueldo<=0) impuesto=0;
		
		if (sueldo<=3000) {
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
			total=total+subSueldo*0.1*descuento*impuesto;
		} else {
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
			total=total+1400*0.1*descuento*impuesto;
		}		
		
		subSueldo=subSueldo-1400;
		if(subSueldo<=0) impuesto=0;
		
		if (sueldo<=4600) {
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
			total=total+subSueldo*0.15*descuento*impuesto;
		} else {
			if (hijos>10) {descuento=1-0.1;}
			else {descuento=(1-(hijos/100));}
			total=total+1600*0.15*descuento*impuesto;
		}
		
		subSueldo=subSueldo-1600;
		if(subSueldo<=0) impuesto=0;
		
		if (sueldo>4600) {
			if (hijos>10) {descuento=1-0.15;}
			else {descuento=(1-((1.5*hijos)/100));}
			total=total+subSueldo*0.20*descuento*impuesto;
		}
		
		
		System.out.printf("Le corresponde pagar %.2f",total);
		
		teclado.close();
	}
}