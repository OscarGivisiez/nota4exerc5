package entidade;

public class Animal {
	public double peso;
	public String cor;

	public Animal() {
	}

	public Animal(double peso, String cor) {
		this.peso = peso;
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String mostraAnimal() {
		return "O peso do animal " + peso + " e sua cor é " + cor + ".";
	}

}
