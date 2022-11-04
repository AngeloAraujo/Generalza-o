package AlunoProfessor;

public class Professor extends Pessoa {

	public String disciplina;

	public Professor() {
		
	}
	
	public Professor(String disciplina) {
		setDisciplina(disciplina);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		if (disciplina.length()>0)
			this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor Disciplina=");
		builder.append(disciplina);
		builder.append(", ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
	
}
