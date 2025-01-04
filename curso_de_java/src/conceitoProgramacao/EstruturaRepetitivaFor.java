package conceitoProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */
		/*
		 * System.out.println("digite o numero inteiro:"); int X = sc.nextInt(); int
		 * mostrarImpar = 0; for (int i = 0; i <= X; i++) { if (i % 2 == 1) {
		 * mostrarImpar = i; System.out.println(mostrarImpar); } }
		 */
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		/*
		 * System.out.println("digite o numero inteiro:"); int N = sc.nextInt(); int
		 * dentroDoIntervalo10E20 = 0; int foraDoIntervalo10E20 = 0; int X = 0; for (int
		 * i = 0; i <= N; i++) { X = sc.nextInt(); if (X >= 10 && X <= 20) {
		 * dentroDoIntervalo10E20 += 1; } else { foraDoIntervalo10E20 += 1; } }
		 * System.out.println(dentroDoIntervalo10E20 + "in");
		 * System.out.println(foraDoIntervalo10E20 + "out");
		 */

		/*
		 * 
		 * /* Leia 1 valor inteiro N, que representa o número de casos de teste que vem
		 * a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com
		 * uma casa decimal. Apresente a média ponderada para cada um destes conjuntos
		 * de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
		 * 3 e o terceiro valor tem peso 5.
		 */
		/*
		 * int n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * double a = sc.nextDouble(); double b = sc.nextDouble(); double c =
		 * sc.nextDouble();
		 * 
		 * double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		 * 
		 * System.out.printf("%.1f%n", media); }
		 */
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		/*
		 * int n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * if (y == 0) { System.out.println("divisao impossivel"); } else { double div =
		 * (double) x / y; System.out.printf("%.1f%n", div); } }/* /* Ler um valor N.
		 * Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) *
		 * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
		 */
		/*
		 * int n = sc.nextInt();
		 * 
		 * int fat = 1; for (int i = 1; i <= n; i++) { fat = fat * i; }
		 * 
		 * System.out.println(fat);
		 */
		/* Ler um número inteiro N e calcular todos os seus divisores. */

		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */
		sc.close();

	}

}
