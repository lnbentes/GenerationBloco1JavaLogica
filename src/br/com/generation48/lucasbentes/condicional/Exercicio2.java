package br.com.generation48.lucasbentes.condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Faça um programa que entre com três números e coloque em ordem crescente.*/
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		int lista[] = new int[3];
		System.out.println("Entre com 3 numeros inteiros: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if(a > b && a > c) {
			lista[0] = a;
		}else if(b > a && b > c) {
			lista[0] = b;
		}else if(c > a && c > b) {
			lista[0] = c;
		}
		
		if(a < b && a > c || a > b && a < c) {
			lista[1] = a;
		}else if(b < a && b > c || b > a && b < c) {
			lista[1] = b;
		}else if(c < a && c > b || c > a && c < b) {
			lista[1] = c;
		}
		
		if(a < b && a < c) {
			lista[2] = a;
		}else if(b < a && b < c) {
			lista[2] = b;
		}else if(c < a && c < b) {
			lista[2] = c;
		}
		
		System.out.println("Os numeros em ordem crescente: " + lista[0] + " " + lista[1] + " " + lista[2]);
		
		ler.close();
		

	}

}
