package orientacaoObjetoLista1;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public void calculoNota() {
		double calculo = nota1 + nota2 + nota3;
		double restante = 60.00;
		if (calculo < 60.00) {
			System.out.println("NOTA FINAL = " + calculo);
			System.out.println("REPROVADO");
			System.out.println("Faltou cerca de :" + (restante - calculo));
		} else {
			System.out.println("NOTA FINAL = " + calculo);
			System.out.println("APROVADO");
		}
	}
}
