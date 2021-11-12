package OrientadaObjeto;

public class Aviao {

	private String nomeCompania;
	private String destino;
	private String  voo;
	private int passageiros;
	
	public Aviao(String nomeCompania,String destino,String voo,int passageiros)
	{
		this.nomeCompania = nomeCompania;
		this.destino = destino;
		this.voo = voo;
		this.passageiros = passageiros;
	}
	
	public Aviao(int passageiros)
	{
		this.passageiros = passageiros;
	}
	
	public void mostrarInfo()
	{
		System.out.println("\nNome da companhia: "+nomeCompania + " ,destino: "+ destino + " ,identificação do voo: " + voo + ", este voo conta com " + passageiros + " passageiros.");
	}

	public String getNomeCompania() {
		return nomeCompania;
	}

	public void setNomeCompania(String nomeCompania) {
		this.nomeCompania = nomeCompania;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
}