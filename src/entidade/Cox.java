package entidade;

public class Cox extends Cachorro {
	public boolean tosa = true;

	public Cox() {
		super();
	}

	public Cox(boolean tosa) {
		this.tosa = tosa;
	}

	public Cox(double peso, String cor, String nome, String raca, boolean tosa) {
		super(peso, cor, nome, raca);
		this.tosa = tosa;
	}

	public Cox(double peso, String cor, boolean tosa) {
		this.tosa = tosa;
	}

	public void mostraTosa(boolean tosa) {
		if (tosa == true) {
			System.out.println("Este cachorro está tosado!");

		} 
		if (tosa==false){
			System.out.println("Você precisa tosar o cachorro!");
		}

	}

}
