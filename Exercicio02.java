package lista001;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		double real, dolar, convercao;
		System.out.println("Digite o valor em Real");
		real = leitura.nextDouble();
		System.out.println("Digite o valor em dólar");
		dolar = leitura.nextDouble();
		convercao = (real/dolar);
		System.out.println("O valor para a conver��o �:");
		System.out.println(convercao);
		
		
	}

}
