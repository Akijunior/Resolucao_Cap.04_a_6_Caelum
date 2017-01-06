package Aplication;

import Developer.Empresa;
import Developer.Funcionario;

public class TestaEmpresa {
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.salario = 1000;
		funcionario1.nome_Funcionario = "Fabio";
		empresa.adiciona(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.salario = 1700;
		funcionario2.nome_Funcionario = "Fabiola";
		empresa.adiciona(funcionario2);
		
		for (int i = 0; i < 5; i++) {
			  Funcionario funcionario = new Funcionario();
			  funcionario.salario = 1000 + i * 100;
			  empresa.adiciona(funcionario);
			}
		empresa.mostraEmpregados();
	}

}
