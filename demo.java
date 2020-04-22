package Aplication;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		/*  Escreva um programa
			que receba uma série de 
			3 números, determine o maior deles e o imprima */
		
		System.out.print("entre 3 numeros: \n");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int max = Math.max(x, y);
		
		if (max > z) {
			System.out.println(max);
		} else {
		System.out.println(z);
		}

	}

}
