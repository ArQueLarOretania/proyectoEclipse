package com.google.eclipse.vista;

import java.util.Scanner;

public class clase121123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();
		int resultado = num1 + num2;
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
	}

}
