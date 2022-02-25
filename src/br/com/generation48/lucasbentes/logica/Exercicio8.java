package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.*/
		
		double custoFabri, fornecedor = 0.28, impostos = 0.45, custoCarroNovo, porcentagem;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("#### Calculo de custo de uma carro novo ####");
		System.out.print("Entre com o custo de fabricacao: ");
		custoFabri = ler.nextDouble();
		
		porcentagem = custoFabri * (fornecedor + impostos);

		custoCarroNovo = custoFabri + porcentagem;
		
		System.out.println("################");
		System.out.println("O custo de um carro novo e: " + custoCarroNovo);
		ler.close();
	}

}
