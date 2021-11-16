package OrientadaObjeto;

public class Cavalo extends Animal {

		public Cavalo(String nome, int idade) {
			super(nome, idade);
		}
		
		
		public void som () {
			System.out.println("irrrrrrr irrrrrr irrrrr ");
		}
		
		public void correr () {
			System.out.println("Correndo ");
		}
}
