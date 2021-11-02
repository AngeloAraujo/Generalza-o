package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		//pessoa
		Pessoa a =new Pessoa ("Angelo","Rua Walter Dorico Depiné"); 
		System.out.println(a);
				
		//Pessoa Física
		PessoaFisica pf = new PessoaFisica("Angelo", "Rua Walter Dorico Depiné", "073.154.879-30", "casado");
		System.out.println(pf);
		
		//Pessoa Juridica
		PessoaJuridica pj = new PessoaJuridica("Angelo Ltda", "Rua Walter Dorico Depiné", "25.456.789.0001-31", "Academia");
		System.out.println(pj);
	}

}
