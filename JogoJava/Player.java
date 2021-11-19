package JogoJava;

public class Player extends Pessoa {
	
		private String login;
		private int totJogado;
		
		
		public Player(String nome, int idade, String sexo, String login, int totJogado) {
			super(nome, idade, sexo);
			this.login = login;
			this.totJogado = totJogado;
		}
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public int getTotJogado() {
			return totJogado;
		}
		public void setTotJogado(int totJogado) {
			this.totJogado = totJogado;
		}

		@Override
		public String toString() {
			return ("\n" + super.toString() +  " login - " + login + "- Total de horas jogadas: " + totJogado);
		}
		
		
}
