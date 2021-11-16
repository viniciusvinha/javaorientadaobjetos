package OrientadaObjeto;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void som () {
		System.out.println("Fazendo som de preguiça ");
	}
	public void subirArvore () {
		System.out.println("Subindo na árvore ");
	}
}
