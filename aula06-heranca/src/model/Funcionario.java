package model;

public class Funcionario extends Pessoa {
	
	private double salario = 0;

	public Funcionario(String nome, int idade, String endereco, double salario) {
		super(nome, idade, endereco);
		this.salario = salario;
	}
	

	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		
		if (salario > this.salario) {
			
			this.salario = salario;	
		}
		
	}

	
	public void primeiraLetra(){
		char[] charArr = nome.toCharArray();
		System.out.print("Primeira letra: "+ charArr[0]);
		
	}     
	
	
	

}
