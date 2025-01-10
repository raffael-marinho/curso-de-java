package orientacaoObjetoAplicacaoBancaria;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjetoContaBancaria.Conta;

public class programaBancario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta1;

		System.out.println("digite o numero da conta:");
		int numero = sc.nextInt();
		System.out.println("digite o nome do titular:");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("deseja depositar algum valor inicial na conta:");
		char respostaDeposito = sc.next().charAt(0);
		if (respostaDeposito == 's') {
			System.out.println("digite o saldo inicial da conta:");
			double inicialSaldo = sc.nextDouble();
			conta1 = new Conta(numero, nomeTitular, inicialSaldo);
		} else {
			conta1 = new Conta(numero, nomeTitular);
		}

		System.out.println();
		System.out.println("dados da conta:");
		System.out.println(conta1);

		System.out.println();
		System.out.println("deposite um valor para deposito:");
		double deposito = sc.nextDouble();
		conta1.deposito(deposito);
		System.out.println(conta1);

		System.out.println();
		System.out.println("deposite um valor para saque:");
		double saque = sc.nextDouble();
		conta1.saque(saque);
		System.out.println(conta1);

		sc.close();
	}

}
