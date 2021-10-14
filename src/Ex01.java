import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1 – Para um ano de nascimento fornecido pelo usuário, informe a idade que ele
		 * terá no dia 31 de dezembro de 2021.
		 */

		Scanner leitor = new Scanner(System.in);

		int anoNascimento, idade;

		System.out.println("Por favor insira seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();

		idade = 2021 - anoNascimento;

		System.out.println("Você tem " + idade + " anos");
		leitor.close();

	}

}
