package OrientadaObjeto;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("TAM","ROMA","TAM875",154);
		aviao1.mostrarInfo();
		System.out.println("\n***Passageiros do voo TAM875, o voo se encontra dispon�vel para embarque***");
		aviao1.setVoo("\nO voo TAM875 est� para sair, �ltima chamada");
		aviao1.mostrarInfo();
				
		Aviao aviao2 = new Aviao("GOL","NEW YORK","GOL323",178);
		aviao2.mostrarInfo();
		System.out.println("\n***Passageiros do voo GOL323, o voo se encontra dispon�vel para embarque***");
		aviao2.setVoo("\nO voo GOL323 est� para sair, �ltima chamada");
		aviao2.mostrarInfo();
	}

}
