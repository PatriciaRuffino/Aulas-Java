package main;

import model.Aluno;
import model.Funcionario;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Patricia", 37, "Rua Bonita");
		pessoa.mostrar();
		
		Pessoa pessoa1 = new Aluno("Naomi", 16, "Rua Chic", "segundo", "Java");
		pessoa1.mostrar();

		//Aluno aluno = new Aluno("Gabriela", 16, "Rua das Flores", "primeiro", "Introdução à Java");
		//aluno.mostrar();

		//Funcionario func = new Funcionario("Luís", 52, "Rua dos Ipês", 0);
		//func.mostrar();
		//func.primeiraLetra();

		// Upcasting
		//Pessoa p1 = new Aluno("Victor", 16, "Rua Das Bromélias", "segundo", "Lógica de programação");
		//p1.mostrar();

		// Downcasting

		//Aluno aluno2 = (Aluno) aluno;
		//aluno2.mostrar();

		// classCastException
		// Aluno a1 = (Aluno)pessoa;
	//	if (pessoa instanceof Aluno) {
	//		Aluno a1 = (Aluno) pessoa;
	//		System.out.println("É aluno");
	//	} else if (aluno2 instanceof Aluno) {
	//		Pessoa a1 = (Pessoa) pessoa;
//			System.out.println("Nao é aluno");
		}

	}


