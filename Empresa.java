package Developer;

import javax.swing.JOptionPane;

public class Empresa {
	
	public Funcionario[] empregados;
	public String cnpj, nome_Empresa;
	private int contadorDePessoal = 0;

	
	public void adiciona(Funcionario f) {
		
		if (empregados.length < contadorDePessoal)
			System.out.println("O grupo previsto j� se encontra cheio.");
		else if ((empregados.length >= contadorDePessoal)) {
				this.empregados[contadorDePessoal] = f;
				contadorDePessoal += 1;
		}
	}
	
	public void mostraEmpregados() {
		  for (int i = 0; i < this.empregados.length; i++) {
		    System.out.println("Funcion�rio na posi��o: " + i);
		    System.out.println(empregados[i].mostra());
		    System.out.println("/nPr�ximo\n");
		  }
		}
	
	public void cadastroDefinidoDePessoal() {
		
	}

}
