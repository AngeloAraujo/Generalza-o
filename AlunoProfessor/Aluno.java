package AlunoProfessor;

public class Aluno extends Pessoa {

	private int matricula;

	public Aluno() {
		
	}
	
	public Aluno(int matricula) {
		setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula>0)
			this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno Matricula=");
		builder.append(matricula);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("");
		return builder.toString();
	}
	
	
}
