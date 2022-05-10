package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Exercício Calculadora");
		System.out.println();
		System.out.println("Digite dois números: ");
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		System.out.println("A soma dos números é: " + Calculadora.soma(numero1, numero2));
		System.out.println("A subtração dos números é: " + Calculadora.subtracao(numero1, numero2));
		System.out.println("A multiplicação dos números é: " + Calculadora.multiplicacao(numero1, numero2));
		System.out.println("A divisão dos números é: " + Calculadora.divisao(numero1, numero2));
		
		
		Mensagem.mensagem();
	
	
	
	
	}
}
