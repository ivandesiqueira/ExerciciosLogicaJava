import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		/*
		 * 6 – Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		 * “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e
		 * um cupom, informando o valor final a ser pago.!!!
		 */

		Scanner leitor = new Scanner(System.in);

		double totalCompras, valorFinal;
		String cupom;

		System.out.println("=== SISTEMA DE VENDAS CUPOM DE DESCONTO ===");

		System.out.println("Informe o valor da compra do cliente:");
		totalCompras = leitor.nextDouble();

		System.out.println("Informe o cupom de desconto do cliente:");
		cupom = leitor.next();

		if (cupom.equals("desconto03")) {
			valorFinal = totalCompras * 0.97;
			System.out.println("VOCÊ UTILIZOU O CUPOM " + cupom);
			System.out.println("Sua compra de R$ " + totalCompras + " foi para R$ " + valorFinal);
		} else {
			valorFinal = totalCompras;
			System.out.println("CUPOM INVÁLIDO");
			System.out.println("Sua compra é de R$ " + totalCompras);
		}

		leitor.close();
	}

}
