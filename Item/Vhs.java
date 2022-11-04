package Item;

public class VHS extends Midia {

	private String titulo;

	public VHS() {
		
	}
	
	public VHS(String titulo) {
		setTitulo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length()>0)
			this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS Titulo=");
		builder.append(titulo);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
