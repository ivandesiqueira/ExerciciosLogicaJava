import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1 � Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele
		 * ter� no dia 31 de dezembro de 2021.
		 */

		Scanner leitor = new Scanner(System.in);

		int anoNascimento, idade;

		System.out.println("Por favor insira seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();

		idade = 2021 - anoNascimento;

		System.out.println("Voc� tem " + idade + " anos");
		leitor.close();

	}

}
