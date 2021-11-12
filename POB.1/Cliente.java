package OrientadaObjeto;

public class Cliente {

	private String nomeCliente;
	private String sobrenome;
	private String apelido;
	private int idade;
	
	public Cliente(String nomeCliente,String sobrenome,String apelido,int idade)
	{
		this.nomeCliente = nomeCliente;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.idade = idade;
	}
	
	public Cliente(int idade)
	{
		this.idade = idade;
	}
	
	public void lerCliente()
	{
		System.out.println("\n"+nomeCliente + " "+ sobrenome + "," + " apelido: " + apelido +"," + " tem: "+idade + " anos.");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
