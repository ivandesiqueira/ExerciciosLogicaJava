import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double minutos, segundos;
		double horas;

		System.out.println("Por favor, informe a duração do filme em minutos:");

		minutos = leitor.nextDouble();
		segundos = minutos * 60;
		horas = minutos / 60;

		System.out.println("O filme tem " + segundos + " segundos de duração");
		System.out.println("O filme tem " + horas + " horas de duração");

	}

}
