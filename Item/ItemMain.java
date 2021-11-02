package Item;

public class ItemMain {

	public static void main(String[] args) {
		
		//Item
		Item A= new Item(1, "Livro");
		System.out.println(A);
				
		//Livro
		Livro B= new Livro(1, "Livro de Terror", "Stephen King");
		System.out.println(B);
	
		//Midia
		Midia desc = new Midia(2, "The Killers", "Universal", 120);
		System.out.println(desc);
		
		// Cd
		Cd D = new Cd(2, "Rock", "Sony", 115, 16, "The Strokes", "The new Abnormal");
		System.out.println(D);
		
		//VHS
		Vhs E = new Vhs(3, "Comédia", "Revolution Studios", 109, "As Branquelas");
		System.out.println(E);
	
	}

}
