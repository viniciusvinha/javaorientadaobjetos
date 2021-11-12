package OrientadaObjeto;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Luis","Guerreiro","Luisinho Praiano",25);
		cliente1.lerCliente();
		System.out.println("\n***O cliente encontra-se nos parâmetros para seguirmos as pesquisas***");
		cliente1.setApelido("Luisinho Praiano, você está apto a seguir");
		cliente1.lerCliente();
				
		Cliente cliente2 = new Cliente("Aimée","Thompson","Aimorosa",24);
		cliente2.lerCliente();
		System.out.println("\n***O cliente não encontra-se nos parâmetros para seguirmos as pesquisas***");
		cliente2.setApelido("Aimorosa, você está não está apta a seguir");
		cliente2.lerCliente();
	}

}
