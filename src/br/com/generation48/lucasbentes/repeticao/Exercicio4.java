package br.com.generation48.lucasbentes.repeticao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.*/
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		int idade, sexo,  opcoes, i = 0;
		int contPesCalm = 0, contMulhNerv = 0, contHomAgr = 0, contOutrCalm = 0, contPesNerv40 = 0, contCalm18 = 0;
		
		while(i <= 150) {
			idade = random.nextInt(100);  //Gerando os dados
			sexo = 1 + random.nextInt(3);
			opcoes = 1 + random.nextInt(3);
			
			System.out.println(i + " - " + idade + " " + sexo + " " + opcoes);
			
			if(opcoes == 1) {  //número de pessoas calmas
				contPesCalm++;
			}
			else if(sexo == 1 && opcoes == 2) {  //número de mulheres nervosas
				contMulhNerv++;
			}
			else if(sexo == 2 && opcoes == 3) {  //número de homens agressivos
				contHomAgr++;
			}
			if(sexo == 3 && opcoes == 1) {  //número de outros calmos
				contOutrCalm++;
			}
			else if(opcoes == 2 && idade > 40) {  //número de pessoas nervosas com mais de 40 anos
				contPesNerv40++;
			}
			else if(opcoes == 1 && idade < 18) {  //número de pessoas calmas com menos de 18 anos
				contCalm18++;
			}
			i++;			
		}
		
		System.out.println("############### Dados das 150 pessoasa ###############");
		System.out.println("número de pessoas calmas: " + contPesCalm);
		System.out.println("número de mulheres nervosas: " + contMulhNerv);
		System.out.println("número de homens agressivos: " + contHomAgr);
		System.out.println("número de outros calmos: " + contOutrCalm);
		System.out.println("número de pessoas nervosas com mais de 40 anos: " + contPesNerv40);
		System.out.println("número de pessoas calmas com menos de 18 anos: " + contCalm18);
		
		ler.close();

	}

}
