package AlunoProfessor;

public class MainAlunoProfessor {

	public static void main(String[] args) {


		Pessoa p = new Pessoa(1, "Angelo", "Rua Walter Dorico Depin�, 211, Bremer, Rio do Sul");
		System.out.println(p);
		
		Professor professor = new Professor("Educa��o F�sica");
		professor.setCodigo(1);
		professor.setNome("Luiz");
		professor.setEndereco("Rua Get�lio vargas, 13, Jd. Am�rica, Rio do Sul");
		System.out.println(professor);
		
		
		Aluno aluno = new Aluno(120);
		aluno.setCodigo(1);
		aluno.setNome("Jo�o");
		aluno.setEndereco("Rua do Padre, 10, Centro, Paris");
		System.out.println(aluno);
	}

}
