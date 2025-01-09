package orientacaoObjetoLista1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo1 = new Retangulo();

		System.out.println("digite o valor da altura e largura:");
		retangulo1.heigth = sc.nextDouble();
		retangulo1.width = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangulo1.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo1.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo1.diagonal());

		sc.close();
	}

}
