package orientacaoObjetoLista1;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentoSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}

	public String dadosFuncionario() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
