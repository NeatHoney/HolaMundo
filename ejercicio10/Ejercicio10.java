package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double baseTriangulo, alturaTriangulo, areaTriangulo;
		
		System.out.println("CALCULADORA DEL ÁREA DEL TRIÁNGULO");
		System.out.println("\n");
		
		System.out.println("Dime cuanto mide la base: ");
		baseTriangulo = teclado.nextDouble();
		
		System.out.println("Dime cuanto mide la altura: ");
		alturaTriangulo = teclado.nextDouble();
		
		areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		
		System.out.println("El área del triángulo es de: " + areaTriangulo);
		

	}

}
