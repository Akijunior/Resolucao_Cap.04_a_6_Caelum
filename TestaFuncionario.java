package Aplication;

import Developer.Data;
import Developer.Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.nome_Funcionario = "Arroz";
		funcionario1.salario = 2500;
		funcionario1.aumento_Salario(500);
		Data data = new Data();
		data.dia = 25;
		data.mes = 03;
		data.ano = 2017;
		funcionario1.data_de_entrada = data;
		
		//Questão 04
		
		funcionario2.nome_Funcionario = "Arroz";
		funcionario2.salario = 2500;
		funcionario2.aumento_Salario(500);
		
		if(funcionario1 == funcionario2) {
			
			System.out.println("São iguais!");
		}
		
		else {
			
			System.out.println("São diferentes!");
		}
		
		funcionario1.mostra();
		
		//Questão 05
		
		Funcionario funcionario3 = funcionario1;
		
if (funcionario1 == funcionario3) {
			
			System.out.println("São iguais!");
		}
		
		else {
			
			System.out.println("São diferentes!");
		}
		//Passam a apontar para o mesmo local.
		
		
		
	}
}
