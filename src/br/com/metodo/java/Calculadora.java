package br.com.metodo.java;

public class Calculadora {

	public double soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("A soma de "+ numero1 + " + " + numero2 + " = " + resultado);
		return resultado;
	}
	
	public  double subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("A subtracao de "+ numero1 + " - " + numero2 + " = " + resultado);
		return resultado;
	}
	
	public double multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("A multiplicacao de "+ numero1 + " x " + numero2 + " = " + resultado);
		return resultado;
	}
	
	public double divisao(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("A divisao de "+ numero1 + " / " + numero2 + " = " + resultado);
		return resultado;
	}
}
