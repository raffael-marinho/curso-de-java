package conceitoProgramacao;

import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
		
		/*System.out.println("digite o primeiro numero:");
		int numero1 = sc.nextInt(); 
		System.out.println("digite o segundo numero:");
		int numero2 = sc.nextInt(); 
		int resutado = numero1 + numero2;
		System.out.printf("o resultado da soma dos numeros %d e %d é igual a %d",numero1, numero2, resutado);*/
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/
		
		/*System.out.println("programa para ler o valor do raio de um círculo");
		System.out.println("digite o valor do raio:");
		double raio = sc.nextDouble(); 
		double pi = 3.14159;
		double area = pi*(raio*raio);
		System.out.printf("o valor da área deste círculo %.4f",area);*/
		
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		/*System.out.println("digite o primeiro numero:");
		int A = sc.nextInt();
		System.out.println("digite o segundo numero:");
		int B = sc.nextInt();
		System.out.println("digite o terceiro numero:");
		int C = sc.nextInt();
		System.out.println("digite o quarto numero:");
		int D = sc.nextInt();

		int diferenca =  (A * B - C * D);
		
		System.out.printf("a diferença do produto\r\n"
				+ "de A e B pelo produto de C e D é igual a: %d", diferenca);*/
		
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
		
		/*System.out.println("digite o numero do funcionario:");
		double NUMBER = sc.nextDouble();
		System.out.println("digite o numero de horas trabalhadas:");
		double horasTrabalhadas = sc.nextDouble();
		System.out.println("o valor que o funcionario rece por hora:");
		double recebePorHora = sc.nextDouble();
		double SALARY = recebePorHora* horasTrabalhadas;
		System.out.printf("NUMBER = %.0f\r\n"
				+ "SALARY = U$ %.2f", NUMBER,SALARY);*/
		
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		/*System.out.println("digite o código de uma peça1:");
		double peca1 = sc.nextDouble();
		System.out.println("digite o número de peças1:");
		double numeroDePecas1 = sc.nextDouble();
		System.out.println("digite o valor unitário de cada peça1:");
		double  valorUnitario1 = sc.nextDouble();
		
		System.out.println("digite o código de uma peça2:");
		double peca2 = sc.nextDouble();
		System.out.println("digite o número de peças2:");
		double numeroDePecas2 = sc.nextDouble();
		System.out.println("digite o valor unitário de cada peça2:");
		double  valorUnitario2 = sc.nextDouble();
		
		double calculo1 = numeroDePecas1*valorUnitario1;
		double calculo2 = numeroDePecas2*valorUnitario2;
		double resutado = calculo1+calculo2;
		System.out.printf("VALOR A PAGAR: R$ %.2f", resutado);*/
		
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
		
		System.out.println("digite o primeiro numero:");
		double A = sc.nextDouble();
		System.out.println("digite o segundo numero:");
		double B = sc.nextDouble();
		System.out.println("digite o terceiro numero:");
		double C = sc.nextDouble();
		
		double pi = 3.14159;
		double TRIANGULO = (A*C)/2;
		double CIRCULO = pi*(C*C);
		double TRAPEZIO = ((A+B)*C)/2;
		double QUADRADO = B*B; 
		double RETANGULO = B*A;
		
		System.out.printf("TRIANGULO: %.3f\r\n"
				+ "CIRCULO: %.3f\r\n"
				+ "TRAPEZIO: %.3f\r\n"
				+ "QUADRADO: %.3f\r\n"
				+ "RETANGULO: %.3f",TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
	}
}
