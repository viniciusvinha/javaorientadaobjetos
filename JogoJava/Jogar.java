package JogoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		Jogo j[] = new Jogo[3];
		j[0] = new Jogo("Mapa das Trevas", "Díficil", 200, 8);
		j[1] = new Jogo("Mapa das Feiticeiras", "Médio", 145, 4);
		j[2] = new Jogo("Mapa dos Magos", "Fácil", 400, 9);
		
		Player p[] = new Player [3];
		p [0] = new Player("Vinicius", 23, "M", "ElTouro", 12);
		p [1] = new Player("Felipe", 26, "M", "Bras.com", 3);
		p [2] = new Player("Eduardo", 20, "M", "Xena", 9);
		
		
		try 
		{
			System.out.println("\t\nEscolha o seu personagem, meu chapa");
	        System.out.println("0- ElTouro ");
	        System.out.println("1- Bras.com ");
	        System.out.println("2- Xena ");
	        int x = leia.nextInt();
		

	        if(x==0) {
	            TelaJogo tj = new TelaJogo(p[0], j[0] );
	            System.out.println(tj.toString()); //mostra relação jogador/mapa
	            System.out.println("\nA avaliação deste mapa que os usuários atribuiram foi de: " + j[0].getAvaliacao());  
	            System.out.println("\nEsta é avaliação dos outros usuários, você concorda ou gostaria de estabelecer uma nova avalição?\n1 - Sim 2- Não ");
	            int y = leia.nextInt();
	            	if (y == 1 ) {
	            		System.out.println("\nDiga sua nota:");
	            		int z = leia.nextInt();
	            		j[0].setAvaliacao(z);
	            		System.out.println("\nA avaliação estabelecida por você foi de: " + j[0].getAvaliacao());
	            	}else {
	            		System.out.println("\nA avaliação do mapa então foi de: " + j[0].getAvaliacao());
	            	}
	            		
	            		
	        }
	       

	        if(x==1) {
	            TelaJogo tj = new TelaJogo(p[1], j[1] );
	            System.out.println(tj.toString()); //mostra relação jogador/mapa
	            System.out.println("\nA avaliação deste mapa que os usuários atribuiram foi de: " + j[1].getAvaliacao());  
	            System.out.println("\nEsta é avaliação dos outros usuários, você concorda ou gostaria de estabelecer uma nova avalição?\n1 - Sim 2- Não ");
	            int y = leia.nextInt();
	            	if (y == 1 ) {
	            		System.out.println("\nDiga sua nota:");
	            		int z = leia.nextInt();
	            		j[1].setAvaliacao(z);
	            		System.out.println("\nA avaliação estabelecida por você foi de: " + j[1].getAvaliacao());
	            	}else {
	            		System.out.println("\nA avaliação do mapa então foi de: " + j[1].getAvaliacao());
	            	}
	        }

	        if(x==2) {
	            TelaJogo tj = new TelaJogo(p[2], j[2] );
	            System.out.println(tj.toString()); //mostra relação jogador/mapa
	            System.out.println("\nA avaliação deste mapa que os usuários atribuiram foi de: " + j[2].getAvaliacao()); 
	            System.out.println("\nEsta é avaliação dos outros usuários, você concorda ou gostaria de estabelecer uma nova avalição?\n1 - Sim 2- Não ");
	            int y = leia.nextInt();
	            	if (y == 1 ) {
	            		System.out.println("\nDiga sua nota:");
	            		int z = leia.nextInt();
	            		j[2].setAvaliacao(z);
	            		System.out.println("\nA avaliação estabelecida por você foi de: " + j[2].getAvaliacao());
	            	}else {
	            		System.out.println("\nA avaliação do mapa então foi de: " + j[2].getAvaliacao());
	            	}
	        }
	        leia.close();
		}
		catch(InputMismatchException inputMismatchException) {
			System.err.printf("\nException: %s",inputMismatchException);
		}
	}
	
}
