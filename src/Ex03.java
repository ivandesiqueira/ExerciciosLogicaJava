import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3 � Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e
		 * B. Sem usar uma terceira vari�vel, troque os valores de A e B entre si.
		 */

		Scanner leitor = new Scanner(System.in);

		int a, b;

		System.out.println(
				"=== RECEBER� 2 VALORES INTEIROS E INVERTER� ENTRE SI AS VARI�VEIS QUE ARMAZENAM ESSE VALOR ===");

		System.out.println("Digite um n�mero inteiro para armazenar na vari�vel A:");
		a = leitor.nextInt();

		System.out.println("Digite um n�mero inteiro para armazenar na vari�vel B:");
		b = leitor.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Agora a vari�rel A cont�m o valor: " + a);
		System.out.println("Agora a vari�vel B cont�m o valor: " + b);

		leitor.close();
	}

}
