package br.com.generation48.lucasbentes.repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in);
		int soma = 0, numero = 1, i = 0;
		double media = 0;
				
		do {
			System.out.print("Entre com o valor para media ou 0 para sair: ");
			
			try {
			numero = ler.nextInt();
			}catch(Exception e){
				System.out.println("So e valido numeros inteiros!!!!");
				break;
			}
			
			soma = soma + numero;
			i++;
		}while(numero != 0);
		
		media = soma / i;
		System.out.println("####################################");
		System.out.println(soma + " / " + i + " = " + media);
		System.out.printf("A media dos numeros e igual a %.2f", media);
		
		ler.close();

	}

}
