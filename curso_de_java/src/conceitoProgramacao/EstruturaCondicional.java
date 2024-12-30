package conceitoProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		/*System.out.println("digite o primeiro numero inteiro:");
		int numero = sc.nextInt();
		if (numero<0) 
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");*/
		
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		/*System.out.println("digite o primeiro numero inteiro:");
		int numero = sc.nextInt();
		if (numero%2==0) 
			System.out.println("PAR");
		else
			System.out.println("IMPAR");*/
		
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente*/
		
		/*System.out.println("digite o primeiro numero inteiro:");
		int numero1 = sc.nextInt();
		System.out.println("digite o segundo numero inteiro:");
		int numero2 = sc.nextInt();
		
		if (numero2%numero1 == 0 || numero1%numero2 == 0) 
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");*/
		
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		/*System.out.println("digite a hora inicial do jogo:");
		int horaInicial = sc.nextInt();
		System.out.println("digite a hora final do jogo:");
		int horaFinal = sc.nextInt();
		int calculoHora;
		if (horaInicial < horaFinal) 
			calculoHora = horaFinal - horaInicial;
		else
			calculoHora = 24 - horaInicial + horaFinal;
		
		System.out.println("O JOGO DUROU " + calculoHora + " HORA(S)");*/

		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/
		
		/*System.out.println("digite o codigo do item:");
		int codigo = sc.nextInt();
		System.out.println("digite a quantidade:");
		int quantidade = sc.nextInt();
		
		if (codigo == 1) {
			System.out.println("Total: R$ " + quantidade*4.00);
		} else if(codigo == 2) {
			System.out.println("Total: R$ " + quantidade*4.50);
		}else if(codigo == 3) {
			System.out.println("Total: R$ " + quantidade*5.00);
		}else if(codigo == 4) {
			System.out.println("Total: R$ " + quantidade*2.00);
		}else if(codigo == 5) {
			System.out.println("Total: R$ " + quantidade*1.50);
		}*/
		
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		
		/*System.out.println("digite o numero para saber em qual intervalo esta:");
		double entrada = sc.nextDouble();
		
		if (entrada>=0.0) {
			if (entrada<=25.0) {
				System.out.println("Intervalo [0,25]\n");
			}else if (25.0<entrada && entrada<=50.0) {
				System.out.println("Intervalo [25,50]\n");
			}else if (50.0<entrada && entrada<75.0) {
				System.out.println("Intervalo [50,75]\n");
			}else if (75.0<entrada && entrada<=100.0) {
				System.out.println("Intervalo [75,100]\n");
			}
		}else {
			System.out.println("Fora de intervalo");
		}*/
		
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.*/
		
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.*/
		sc.close();
	}

}
