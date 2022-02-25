package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		respectivamente.*/
		
		double nota1, nota2, nota3;
		double mediaP; //Media ponderada
		int peso1 = 2, peso2 = 3, peso3 = 5;
		Scanner ler = new Scanner(System.in);
				
		System.out.println("##### Media Ponderada #####");
		System.out.println("Escreva as notas do aluno:");
		System.out.print("Nota 1 = ");
		nota1 = ler.nextDouble();
		System.out.print("Nota 2 = ");
		nota2 = ler.nextDouble();
		System.out.print("Nota 3 = ");
		nota3 = ler.nextDouble();
		
		mediaP = (((peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3)) / (peso1 + peso2 + peso3));
		
		System.out.println("###############");
		System.out.println("A media ponderada e: " + mediaP);
		
		ler.close();

	}

}
