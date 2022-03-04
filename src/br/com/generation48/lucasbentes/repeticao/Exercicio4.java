package br.com.generation48.lucasbentes.repeticao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas;
o n�mero de mulheres nervosas;
o n�mero de homens agressivos;
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.*/
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		int idade, sexo,  opcoes, i = 0;
		int contPesCalm = 0, contMulhNerv = 0, contHomAgr = 0, contOutrCalm = 0, contPesNerv40 = 0, contCalm18 = 0;
		
		while(i <= 150) {
			idade = random.nextInt(100);  //Gerando os dados
			sexo = 1 + random.nextInt(3);
			opcoes = 1 + random.nextInt(3);
			
			System.out.println(i + " - " + idade + " " + sexo + " " + opcoes);
			
			if(opcoes == 1) {  //n�mero de pessoas calmas
				contPesCalm++;
			}
			else if(sexo == 1 && opcoes == 2) {  //n�mero de mulheres nervosas
				contMulhNerv++;
			}
			else if(sexo == 2 && opcoes == 3) {  //n�mero de homens agressivos
				contHomAgr++;
			}
			if(sexo == 3 && opcoes == 1) {  //n�mero de outros calmos
				contOutrCalm++;
			}
			else if(opcoes == 2 && idade > 40) {  //n�mero de pessoas nervosas com mais de 40 anos
				contPesNerv40++;
			}
			else if(opcoes == 1 && idade < 18) {  //n�mero de pessoas calmas com menos de 18 anos
				contCalm18++;
			}
			i++;			
		}
		
		System.out.println("############### Dados das 150 pessoasa ###############");
		System.out.println("n�mero de pessoas calmas: " + contPesCalm);
		System.out.println("n�mero de mulheres nervosas: " + contMulhNerv);
		System.out.println("n�mero de homens agressivos: " + contHomAgr);
		System.out.println("n�mero de outros calmos: " + contOutrCalm);
		System.out.println("n�mero de pessoas nervosas com mais de 40 anos: " + contPesNerv40);
		System.out.println("n�mero de pessoas calmas com menos de 18 anos: " + contCalm18);
		
		ler.close();

	}

}
