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


	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}

	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}


	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		
		System.out.println("Salario: " + this.getSalario());
	}
	
	

}
