import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2 � Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		 * solicite ao usu�rio que digite o tempo de um filme em minutos e informe a
		 * dura��o desse filme em horas e em segundos.
		 */

		Scanner leitor = new Scanner(System.in);

		double minutos, segundos;
		double horas;

		System.out.println("Por favor, informe a dura��o do filme em minutos:");

		minutos = leitor.nextDouble();
		segundos = minutos * 60;
		horas = minutos / 60;

		System.out.println("O filme tem " + segundos + " segundos de dura��o");
		System.out.println("O filme tem " + horas + " horas de dura��o");
		leitor.close();

	}

}
