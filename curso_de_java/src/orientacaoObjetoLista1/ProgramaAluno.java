package orientacaoObjetoLista1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		aluno.calculoNota();
		sc.close();
	}

}
