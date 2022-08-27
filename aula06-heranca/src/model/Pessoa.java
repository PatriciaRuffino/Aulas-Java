package model;

public class Pessoa {
	protected String nome;
	private int idade;
	private String endereco;

	public Pessoa(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void mostrar() {
		System.out.println(this.getClass().toString());
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endereço: " + endereco);
	}

}
