package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Exerc�cio Calculadora");
		System.out.println();
		System.out.println("Digite dois n�meros: ");
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		System.out.println("A soma dos n�meros �: " + Calculadora.soma(numero1, numero2));
		System.out.println("A subtra��o dos n�meros �: " + Calculadora.subtracao(numero1, numero2));
		System.out.println("A multiplica��o dos n�meros �: " + Calculadora.multiplicacao(numero1, numero2));
		System.out.println("A divis�o dos n�meros �: " + Calculadora.divisao(numero1, numero2));
		
		
		Mensagem.mensagem();
	
	
	
	
	}
}
