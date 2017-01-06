package Developer;

public class Funcionario {
	
	public String nome_Funcionario = "?";
	private String departamento = "Nenhum";
	private double salario;
	public String RG;
	private Data data_de_entrada;
	private int instancia = 0;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome) {
		
		this.nome_Funcionario = nome;
		instancia ++;
	}
	
	public int getInstancia() {
		return instancia;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getData_de_entrada() {
		return data_de_entrada;
	}
	
	
	public void setData_de_entrada(Data data_de_entrada) {
		this.data_de_entrada = data_de_entrada;
	}
	
	
	String selecao_Departamento(String departamentoEscolhido) {
		
		this.departamento = departamentoEscolhido;
		return departamento;
	}
	
	public void aumento_Salario(double aumento) {
		
		this.salario += aumento;
		System.out.println("\nO aumento foi realizado com sucesso!\n");
	}
	
	public double calculaGanhoAnual() {
		
		double ganhoAnual = salario * 12;
		return ganhoAnual;
	}
	
	public Object[] mostra() {
		
		System.out.printf("Posição do Funcionário: %s.\n", instancia);
		System.out.printf("Nome do Funcionário: %s.\n", this.nome_Funcionario);
		System.out.printf("Departamento: %s. \n", this.departamento);
		System.out.printf("Ganho Mensal: %s.\n", getSalario());
		System.out.printf("Data de entrada: %d/%d/%d.\n", data_de_entrada.dia, data_de_entrada.mes, data_de_entrada.ano);
		System.out.printf("RG: %s.", this.RG);
		return null;
	}
	

}
