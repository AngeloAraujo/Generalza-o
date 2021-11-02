package Item;

public class Midia extends Item{
	
	protected String gravadora;
	protected int duracao;
	
	public Midia() {
		super();
		
	}
	public Midia(int codigo, String descricao, String gravadora, int duracao) {
		super(codigo, descricao);
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
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		if (duracao>0)
		this.duracao = duracao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
