package main;

import model.Aluno;
import model.Funcionario;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Patricia", 37, "Rua Bonita");
		pessoa.mostrar();
		
		
		Aluno aluno = new Aluno("Gabriela", 16, "Rua das Flores", "primeiro", "Introdução à Java");
		aluno.mostrar();
		
		Funcionario func = new Funcionario("Luís", 52, "Rua dos Ipês", 0);
		func.mostrar();
		func.primeiraLetra();

	} 

}
