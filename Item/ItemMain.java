package Item;

public class ItemMain {

	public static void main(String[] args) {

		Item i = new Item(1,"Abacate");
		System.out.println(i);
		
		Livro l = new Livro("Curvello");
		l.setCodigo(103);
		l.setDescricao("Um livro top");
		System.out.println(l);
		
		Midia m = new Midia("Som Livre", 23.5f);
		m.setCodigo(10);
		m.setDescricao("Amado Batista");
		System.out.println(m);
		
		VHS v = new VHS("ET");
		v.setCodigo(201);
		v.setDescricao("Filme ET");
		v.setGravadora("Disney");
		v.setDuracao(23.5f);
		
		System.out.println(v);
		
		CD cd = new CD(10, "Xuxa", "Lua de Cristal");
		cd.setCodigo(50);
		cd.setDescricao("Um cd velho");
		cd.setGravadora("Sony");
		cd.setDuracao(65f);
		System.out.println(cd);
	}

}
