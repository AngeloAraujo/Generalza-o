package Item;

public class Midia extends Item {

	private String gravadora;
	private float duracao;
	
	
	public Midia() {
		
	}
	
	public Midia(String gravadora, float duracao) {
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		if (gravadora.length()>0)
			this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		if (duracao>0)
			this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia Gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
