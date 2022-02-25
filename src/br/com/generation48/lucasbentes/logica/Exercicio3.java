package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		
		int eventoHoras, eventoMinutos, eventoSegundos, resto, evento;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quanto tempo durou o evento em segundos?: ");
		evento = ler.nextInt();
		
		eventoHoras = evento / 3600;
		resto = evento % 3600;
		eventoMinutos = resto / 60;
		eventoSegundos = resto % 60;
		
		System.out.println("#############");
		System.out.println("Os dados da duracao do evento sao: \n" + eventoHoras + " Horas \n" + eventoMinutos + " Minutos \n"
				+ eventoSegundos + " Segundos");
		
		ler.close();

	}

}
