package Item;

public class Livro extends Item{

	private String autor;

	public Livro() {
		
	}
	public Livro (String autor) {
		setAutor(autor);
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length()>0)
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro Autor=");
		builder.append(autor);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
