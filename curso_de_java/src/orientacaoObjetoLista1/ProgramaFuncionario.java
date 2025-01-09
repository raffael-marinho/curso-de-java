package orientacaoObjetoLista1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario1 = new Funcionario();

		System.out.print("Name: ");
		funcionario1.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario1.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario1.imposto = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionario: " + funcionario1.dadosFuncionario());
		System.out.println();
		System.out.print("qual a porcentagem salarial que vai ser aumentada? ");
		double porcentagem = sc.nextDouble();
		funcionario1.aumentoSalario(porcentagem);

		System.out.println();
		System.out.println("Funcionario: " + funcionario1.dadosFuncionario());

		sc.close();
	}

}
