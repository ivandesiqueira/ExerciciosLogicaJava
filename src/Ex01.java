import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int anoNascimento, idade;
		System.out.println("Por favor insira seu ano de nascimento: ");

		anoNascimento = leitor.nextInt();

		idade = 2021 - anoNascimento;

		System.out.println("Você tem " + idade + " anos");
		leitor.close();

	}

}
