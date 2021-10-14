import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3 – Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e
		 * B. Sem usar uma terceira variável, troque os valores de A e B entre si.
		 */

		Scanner leitor = new Scanner(System.in);

		int a, b;

		System.out.println(
				"=== RECEBERÁ 2 VALORES INTEIROS E INVERTERÁ ENTRE SI AS VARIÁVEIS QUE ARMAZENAM ESSE VALOR ===");

		System.out.println("Digite um número inteiro para armazenar na variável A:");
		a = leitor.nextInt();

		System.out.println("Digite um número inteiro para armazenar na variável B:");
		b = leitor.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Agora a variárel A contém o valor: " + a);
		System.out.println("Agora a variável B contém o valor: " + b);

		leitor.close();
	}

}
