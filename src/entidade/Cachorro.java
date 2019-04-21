package entidade;

public class Cachorro extends Animal {

	public String nome;
	public String raca;

	public Cachorro() {
		super();
	}

	public Cachorro(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public Cachorro(double peso, String cor, String nome, String raca) {
		super(peso, cor);
		this.nome = nome;
		this.raca = raca;
	}

	public Cachorro(String nome) {
		this.nome = nome;

	}

	public String mostrarNome() {
		return "O nome do animal e " + nome + " e sua raça e " + raca + ".";
	}

}
