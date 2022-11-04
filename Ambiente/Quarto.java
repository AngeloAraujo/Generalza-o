package Ambiente;

public class Quarto extends Ambiente {

	private int capacidade;
	
	public Quarto() {
		
	}
	
	public Quarto(int capacidade) {
		setCapacidade(capacidade);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if (capacidade>0)
			this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto Capacidade=");
		builder.append(capacidade);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
}
