/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 6.Algoritmo   que   pida   los   parámetros   (a,   b   y c de   tipo   double)   de   dos   rectas,   correspondientes a su 		ecuación implícita (ax + by + c = 0), e indique si son coincidentes, paralelas  o  secantes.  En  el  caso  de  que  sean  secantes,  		hay  que  indicar  si  son  perpendiculares o no. Las dos rectas se definen como A1x+B1y+C1=0 y A2x+B2y+C2=0, o sea que pedimos 6 		valores por teclado:•Dos rectas son secantes si 𝐴𝐴1𝐴𝐴2≠𝐵𝐵1𝐵𝐵2•Dos rectas son perpendiculares si son secantes y 𝐴𝐴1𝐵𝐵1=−𝐵𝐵2𝐴𝐴2•Dos rectas 		son paralelas si  𝐴𝐴1𝐴𝐴2=𝐵𝐵1𝐵𝐵2•Dos rectas son coincidentes si son paralelas y 𝐴𝐴1𝐴𝐴2=𝐵𝐵1𝐵𝐵2=𝐶𝐶1𝐶𝐶2
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la componente X, la componente Y y la constante de la primera recta: ");
		double a1=teclado.nextDouble(), b1=teclado.nextDouble(), c1=teclado.nextDouble();
		
		System.out.println("Introduzca la componente X, la componente Y y la constante de la segunda recta: ");
		double a2=teclado.nextDouble(), b2=teclado.nextDouble(), c2=teclado.nextDouble();

		if (a1/a2!=b1/b2) {
			System.out.println("Son rectas secantes");
			if (a1/b1==-b2/a2)
				System.out.println("y son perpendiculares.");
		} else if (a1/a2==b1/b2)
			System.out.println("Son rectas paralelas");
			if (a1/a2==b1/b2 && b1/b2==c1/c2)
				System.out.println("son coincidentes.");
		teclado.close();
	}

}
