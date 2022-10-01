package br.com.metodo.java;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----Exercicios Calculadora----");
		System.out.println();
		Calculadora c1 = new Calculadora();
		c1.soma(10, 20);
		c1.subtracao(20, 10);
		c1.multiplicacao(10, 20);
		c1.divisao(100, 5);
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("----Exercicio Mensagem----");
		System.out.println();
		Mensagem m1 = new Mensagem();
		m1.obterMensagem(10);
		
		System.out.println();
		System.out.println();

		
		System.out.println("----Exercicio Emprestimo----");		
		System.out.println();
		Emprestimo e1 = new Emprestimo();
		e1.calcularEmprestimo(1250, 2);
		
		

	}

}
