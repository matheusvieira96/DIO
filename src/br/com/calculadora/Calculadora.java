package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public static double subtracao(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	public static double multiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String opcao = null;
		int operacao;
		
		System.out.println("-----Calculadora-----");
		System.out.println("Deseja realizar operacoes aritmeticas? Digite 'Sim' ou 'Nao' para continuar: ");
		opcao = scan.next();
		
		
		while(opcao.equalsIgnoreCase("Sim")) {
			
			System.out.println("Digite o primeiro numero: ");
			double numero1 = scan.nextDouble();

			System.out.println();
			
			System.out.println("Digite o segundo numero: ");
			double numero2 = scan.nextDouble();
			
			System.out.println();
			System.out.println("1 - Multiplicacao");
			System.out.println("2 - Divisao");
			System.out.println("3 - Adicao");
			System.out.println("4 - Subtracao");
			System.out.println();

			System.out.println("Digite a operacao desejada: ");
			operacao = scan.nextInt();
			System.out.println();
			
			switch (operacao) {
			
			case 1:
				System.out.println("Multiplicacao: "+ multiplicacao(numero1,numero2));
				System.out.println();
				break;
				
			case 2:
				System.out.println("Divisao: " + divisao(numero1,numero2));
				System.out.println();
				break;
				
			case 3:
				System.out.println("Soma : " + soma(numero1,numero2));
				System.out.println();
				break;
				
			case 4:
				System.out.println("Subtracao: " + subtracao(numero1,numero2));
				System.out.println();
				break;
				
			default:
				System.out.println("Operacao invalida");
				System.out.println();
				break;
				
			}
			
			System.out.println("Deseja continuar a realizar as operacoes?" );
			opcao = scan.next();
			System.out.println();
			System.out.println("Muito obrigado por utilizar nosso app, volte sempre :D");
			
		}
	}
}
