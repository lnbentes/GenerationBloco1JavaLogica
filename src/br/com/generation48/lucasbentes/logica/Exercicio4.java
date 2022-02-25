package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		calcule a seguinte expressão:*/
		
		/*inteiro a, b, c //entradas
		real r, s, d //saidas

		escreva("Entre com os valores:")
		escreva("\n valor de A:")
		leia(a)
		escreva("valor de B:")
		leia(b)
		escreva("valor de c:")
		leia(c)

		escreva("################ \n")
		r = math.potencia((a + b), 2)
		escreva("valor de R = ", r)
		s = math.potencia((b + c), 2)
		escreva("\n valor de S = ", s)
		d = (r + s)/2
		escreva("\n valor de D = ", d)*/
		
		double a, b, c; //Entradas
		double r, s, d; //Saidas
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Entre com os valores:");
		System.out.print("valor de A: ");
		a = ler.nextInt();
		System.out.print("valor de B: ");
		b = ler.nextInt();
		System.out.print("valor de C: ");
		c = ler.nextInt();
		
		System.out.println("###################");
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s)/2;
		System.out.println("\n valor de D = " + d);
		
		ler.close();

	}

}
