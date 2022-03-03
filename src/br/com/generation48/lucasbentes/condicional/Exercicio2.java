package br.com.generation48.lucasbentes.condicional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Faça um programa que entre com três números e coloque em ordem crescente.*/
		
		ArrayList<Double> lista = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros inteiros: ");
		lista.add(ler.nextDouble());
		lista.add(ler.nextDouble());
		lista.add(ler.nextDouble());
		
		Collections.sort(lista);
		
		System.out.println("Os numeros em ordem crescente: " + lista);
		
		ler.close();

	}

}
