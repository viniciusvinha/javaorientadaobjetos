package JogoJava;

public class TelaJogo {

		//atributos
	
		private Player jogador;
		private Jogo mapas;
		private int i;
		
		public TelaJogo(Player jogador, Jogo mapas) {
			super();
			this.jogador = jogador;
			this.mapas = mapas;
			this.jogador.setTotJogado(this.jogador.getTotJogado() + 1);
		}
		
		public void notamapa(int nota) {
			this.mapas.setAvaliacao(nota);
		}
		public void notamapa(float totJogado) {
			if (totJogado <= 35) {
				i = 3;
			} else if (totJogado <= 55) {
				i = 6;
			} else if (totJogado <= 90) {
				i = 9;
			} else {
				i = 10;
			}
			this.mapas.setAvaliacao(i);
		}
		

		public Player getJogador() {
			return jogador;
		}

		public void setJogador(Player jogador) {
			this.jogador = jogador;
		}

		public Jogo getMapas() {
			return mapas;
		}

		public void setMapas(Jogo mapas) {
			this.mapas = mapas;
		}

		@Override
		public String toString() {
			return ("\nAqui temos o jogador e o mapa no qual ele irá enfrentar:" + jogador + mapas);
		}

		public void avaliar() {
			// TODO Auto-generated method stub
			
		
		
		
}
}
