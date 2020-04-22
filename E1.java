package Aplication;

import java.util.Iterator;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		/* Leia um valor inteiro X (1 <= X <= 1000).
		Em seguida mostre os ímpares de 1 até X, 
		um valor por linha, inclusive o
		X, se for o caso. */
		
		int x = 0;
		System.out.print("Escrva um número:  ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
			
			for (int i = 0; i < numero; i++) {
				int soma = x++;
				if (soma % 2 !=0) {
					System.out.println(soma);
				}
			}
		
		
		
		}
	}


