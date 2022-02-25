package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
...
que efetua tal cálculo é:*/
		
		
		double x1, y1; //Ponto 1
		double x2, y2; //Ponto 2
		double a, b; //Valores da potencia
		double d; //Distancia
		Scanner ler = new Scanner(System.in);
		
		System.out.println("### Calculo de distancia entre dois pontos ###");
		System.out.println("Entre com as cordenadas do promeiro ponto: ");
		x1 = ler.nextDouble();
		y1 = ler.nextDouble();
		System.out.println("Entre com as cordenadas do segundo ponto: ");
		x2 = ler.nextDouble();
		y2 = ler.nextDouble();
		System.out.println("####################");
		
		a = Math.pow((x2 - x1), 2);
		b = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(a + b);
		
		System.out.println("A distancia e de: " + d);
		
		ler.close();
	}

}
