package lista001;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double r,h,v;
		System.out.println("Digite o valor do raio:");
		r = leitura.nextDouble();
		System.out.println("Digite o valor da altura:");
		h = leitura.nextDouble();
		v = (r*r*h/3.14); 
		System.out.println("O resultado do volume é:");
		System.out.println(v);
	}

}
