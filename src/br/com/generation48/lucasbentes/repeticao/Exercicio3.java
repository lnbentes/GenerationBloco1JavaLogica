package br.com.generation48.lucasbentes.repeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
		
		int idade, menor = 0, maior = 0;
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		
		System.out.println("##### Entre com as iaddes da populacao ##### ");
		System.out.print("idade: ");
		idade = ler.nextInt();
		
		while(idade != -99) {
			lista.add(idade);
			System.out.println("##### Para encerra digite -99 ####");
			System.out.print("idade:");
			idade = ler.nextInt();
		}
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) < 21) {
				menor++;
			}
			else if(lista.get(i) > 50) {
				maior++;
			}
		}
		
		System.out.println("##############################################################");
		System.out.println("Numeor de pessoas com menos de 21 anos e igual a " + menor);
		System.out.println("Numeor de pessoas com mais de 50 anos e igual a " + maior);
		
		ler.close();

	}

}
