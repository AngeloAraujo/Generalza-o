package AlunoProfessor;

public class MainAlunoProfessor {

	public static void main(String[] args) {


		Pessoa p = new Pessoa(1, "Angelo", "Rua Walter Dorico Depiné, 211, Bremer, Rio do Sul");
		System.out.println(p);
		
		Professor professor = new Professor("Educação Física");
		professor.setCodigo(1);
		professor.setNome("Luiz");
		professor.setEndereco("Rua Getúlio vargas, 13, Jd. América, Rio do Sul");
		System.out.println(professor);
		
		
		Aluno aluno = new Aluno(120);
		aluno.setCodigo(1);
		aluno.setNome("João");
		aluno.setEndereco("Rua do Padre, 10, Centro, Paris");
		System.out.println(aluno);
	}

}
