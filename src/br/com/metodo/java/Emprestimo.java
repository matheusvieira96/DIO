package br.com.metodo.java;

public class Emprestimo {

	
	public double getTaxaDuasParcelas() {
		return 0.35;
	}
	
	public double getTaxaTresParcelas() {
		return 0.45;
	}
	
	public void calcularEmprestimo(double valor, int parcela) {
		
		if(parcela == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("O valor total do emprestimo em 2 parcelas fica: " +valorFinal);
			System.out.println("E o valor de cada parcela e igual: " + valorFinal / parcela);
			
		} else if (parcela == 3){
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			System.out.println("O valor total do emprestimo em 3 parcelas fica: " +valorFinal);
			System.out.println("E o valor de cada parcela e igual: " + valorFinal / parcela);
		}
	}
}
