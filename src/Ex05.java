import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5 – Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor
		 * peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve
		 * indicar qual deles deve ser carregado pelo drone.
		 */

		Scanner leitor = new Scanner(System.in);

		double lixo1, lixo2, lixo3;

		System.out.println("=== PROGRAMA QUE SIMULA UM DRONE DE LIMPEZA URBANA ===");

		System.out.println("Informe o peso do primeiro lixo:");
		lixo1 = leitor.nextDouble();

		System.out.println("Informe o peso do segundo lixo:");
		lixo2 = leitor.nextDouble();

		System.out.println("Informe o peso do terceiro lixo:");
		lixo3 = leitor.nextDouble();

		if (lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O primeiro lixo será recolhido, pesando " + lixo1 + " kg!");
		} else {
			if (lixo2 < lixo1 && lixo2 < lixo3) {
				System.out.println("O segundo lixo será recolhido, pesando " + lixo2 + " Kg");
			} else {
				if (lixo3 < lixo1 && lixo3 < lixo2) {
					System.out.println("O terceiro lixo será recolhido, pesando " + lixo3 + " Kg");
				} else {
					System.out.println("Lixos com mesmo peso! Favor enviar mensagem para equipe responsável!");
				}
			}
		}
		leitor.close();
	}

}
