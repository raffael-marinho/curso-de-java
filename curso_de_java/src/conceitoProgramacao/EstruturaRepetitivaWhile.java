package conceitoProgramacao;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		/*
		 * System.out.println("Digite a senha:"); int senha = sc.nextInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha Invalida"); senha =
		 * sc.nextInt(); } System.out.println("Acesso Permitido");
		 */

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		/*
		 * System.out.println("Escreva o ponto X:"); int x = sc.nextInt();
		 * 
		 * System.out.println("Escreva o ponto Y:"); int y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) { if (x > 0 && y > 0) {
		 * System.out.println("primeiro"); } else if (x < 0 && y > 0) {
		 * System.out.println("segundo"); } else if (x < 0 && y < 0) {
		 * System.out.println("terceiro"); } else { System.out.println("quarto"); } x =
		 * sc.nextInt(); y = sc.nextInt(); }
		 */

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		/*
		 * System.out.println("Digite sua opção:"); int numero = sc.nextInt(); int
		 * alcool = 0; int gasolina = 0; int diesel = 0;
		 * 
		 * while (numero != 4) { if (numero == 1) { alcool += 1; } else if (numero == 2)
		 * { gasolina += 1; } else if (numero == 3) { diesel += 1; } numero =
		 * sc.nextInt(); } System.out.println("MUITO OBRIGADO");
		 * System.out.printf("Alcool: %d \n", alcool);
		 * System.out.printf("Gasolina: %d\n", gasolina);
		 * System.out.printf("Diesel: %d\n", diesel);
		 */
		sc.close();
	}

}
