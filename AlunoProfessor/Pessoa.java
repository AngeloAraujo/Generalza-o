package AlunoProfessor;

public class Pessoa {

	private int codigo;
	private String nome;
	private String endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int codigo, String nome, String endereco) {
		setCodigo(codigo);
		setEndereco(endereco);
		setNome(nome);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo>0)
			this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length()>0)
			this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length()>0)
			this.endereco = endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa Código=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(".");
		return builder.toString();
	}
	
	
	
}
