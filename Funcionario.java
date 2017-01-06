package Developer;

public class Funcionario {
	
	public String nome_Funcionario = "?";
	public String departamento = "Nenhum";
	public double salario;
	public String RG;
	public Data data_de_entrada;
	
	String selecao_Departamento(String departamentoEscolhido) {
		
		this.departamento = departamentoEscolhido;
		return departamento;
	}
	
	public void aumento_Salario(double aumento) {
		
		this.salario += aumento;
		System.out.println("O aumento foi realizado com sucesso!");
	}
	
	public double calculaGanhoAnual() {
		
		double ganhoAnual = salario * 12;
		return ganhoAnual;
	}
	
	public Object[] mostra() {
		
		System.out.printf("Nome do Funcionário: %s.\n", this.nome_Funcionario);
		System.out.printf("Departamento: %s. \n", this.departamento);
		System.out.printf("Ganho Mensal: %s.\n", this.salario);
		System.out.printf("Data de entrada: %d/%d/%d.\n", this.data_de_entrada.dia, this.data_de_entrada.mes, this.data_de_entrada.ano);
		System.out.printf("RG: %s.", this.RG);
		return null;
	}
	

}
