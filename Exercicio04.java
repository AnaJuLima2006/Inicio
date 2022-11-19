package lista001;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		  Scanner leitura = new Scanner(System.in);
		  
		  String h1, h2, h3;
		  double heranca, valor;
		  
		  System.out.println("Digite o nome do primeiro herdeiro:");
		  h1 = leitura.next();
		  System.out.println("Digite o nome do segundo herdeiro:");
		  h2 = leitura.next();
		  System.out.println("Digite o nome do terceiro herdeiro:");
		  h3 = leitura.next();
		  System.out.println("Digite o valor da herança:");
		  heranca = leitura.nextDouble();
		  valor = heranca / 3; 
		  
		  System.out.println(h1);
		  System.out.println(valor);
		  System.out.println(h2);
		  System.out.println(valor);
		  System.out.println(h3);
		  System.out.println(valor);
	}

}
