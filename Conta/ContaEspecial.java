package Conta;

public class ContaEspecial extends Conta {

private double limite;
private int diasjuros;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo,double limite, int diasjuros) {
		super(banco, agencia, numeroconta, saldo);
		setLimite(limite);
		setDiasjuros(diasjuros);
	}
	public ContaEspecial() {
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	public int getDiasjuros() {
		return diasjuros;
	}

	public void setDiasjuros(int diasjuros) {
		this.diasjuros = diasjuros;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaLimite limite=");
		builder.append(limite);
		builder.append(", diasjuros=");
		builder.append(diasjuros);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	


}
