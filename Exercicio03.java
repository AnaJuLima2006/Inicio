package lista001;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
				
		double r,h,v;
		System.out.println("Digite o valor do raio:");
		r = leitura.nextInt();
		System.out.println("Digite o valor da altura:");
		h = leitura.nextInt();
		v = (r*r*h/3.14); 
		System.out.println("O resultado do volume é:");
		System.out.println(v);
	}

}
