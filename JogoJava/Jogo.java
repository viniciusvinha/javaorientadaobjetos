package JogoJava;

public class Jogo implements AcoesJogo {
	
	private String mapa;
	private String dificuldade;
	private int quantjogador;
	private int avaliacao;
	private boolean acao;
	
	
	public Jogo() {
		
	}
	
	public Jogo(String mapa, String dificuldade, int quantjogador, int avaliacao) {
		this.mapa = mapa;
		this.dificuldade = dificuldade;
		this.quantjogador = quantjogador;
		this.avaliacao = avaliacao;
		this.acao = false;
		}
	
	//Definido os Get and Set
	
	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		this.mapa = mapa;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getQuantjogador() {
		return quantjogador;
	}

	public void setQuantjogador(int quantjogador) {
		this.quantjogador = quantjogador;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	

	public boolean isAcao() {
		return acao;
	}

	public void setAcao(boolean acao) {
		this.acao = acao;
	}
	
	//métodos implementados
	
	@Override
	public void iniciar() {
		this.acao = true;
		
	}

	@Override
	public void pausar() {
		this.acao = false;
		
	}

	//polimorfismo de sobrescrição
	
	@Override
	public String toString() {
		return ("\nMapa: " + mapa + " - Dificuldade: " + dificuldade + " - Quantidade de jogadores: " + quantjogador
				+ " - Avaliação: " + avaliacao);
	}

}
