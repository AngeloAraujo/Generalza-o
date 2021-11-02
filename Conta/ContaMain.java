package Conta;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta ("Banco do Brasil", 123, 321,0);
		if (c.deposito(1000))
				System.out.println("Depósito OK");
		System.out.println(c.deposito(-100));
		System.out.println(c.saque(100));
		System.out.println(c.saque(901));
		System.out.println(c);
		
		//Conta Simples
		ContaBasica cs = new ContaBasica("Caixa", 456, 654, 100);
		System.out.println(cs.depositopoupanca(40000));
		System.out.println(cs.saquepoupanca(30000));
		System.out.println(cs.saquepoupanca(30000));
		System.out.println(cs);
		
		//Conta Especial
		ContaEspecial cl = new ContaEspecial("Santander", 1215, 12340, -350, 1000, 5);
		System.out.println(cl);
	}

	
	}


