package OrientadaObjeto;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Luis","Guerreiro","Luisinho Praiano",25);
		cliente1.lerCliente();
		System.out.println("\n***O cliente encontra-se nos par�metros para seguirmos as pesquisas***");
		cliente1.setApelido("Luisinho Praiano, voc� est� apto a seguir");
		cliente1.lerCliente();
				
		Cliente cliente2 = new Cliente("Aim�e","Thompson","Aimorosa",24);
		cliente2.lerCliente();
		System.out.println("\n***O cliente n�o encontra-se nos par�metros para seguirmos as pesquisas***");
		cliente2.setApelido("Aimorosa, voc� est� n�o est� apta a seguir");
		cliente2.lerCliente();
	}

}
