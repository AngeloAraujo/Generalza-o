package Pessoa;

public class PessoaFisica extends Pessoa{

	private String cpf;
	private String estadocivil;
	
	public PessoaFisica(String nome, String endereco,String cpf, String estadocivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadocivil(estadocivil);
	}
	public PessoaFisica () {
		
	}
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		if ((cpf.length()>0) && (cpf.length()==14))
		this.cpf = cpf;
	}



	public String getEstadocivil() {
		return estadocivil;
	}



	public void setEstadocivil(String estadocivil) {
		if (estadocivil.length()>0)
		this.estadocivil = estadocivil;
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadocivil=");
		builder.append(estadocivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
