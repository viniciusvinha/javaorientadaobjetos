package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class excollection {

	public static void main(String[] args) {
				
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n1- Gostaria de adicionar itens ao estoque? \n2- Gostaria de remover itens do estoque? \n3- Gostaria de atualizar os itens do estoque? \n4- Gostaria de mostrar os itens do estoque? \n5 - Deseja encerrar o programa.");
			x = ler.nextInt();
			
			switch (x)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nInsira o nome do item para adicionar:");
				String a = ler.nextLine();
				estoque.add(a);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o nome do item que será removido:");
				String b = ler.nextLine();
				
				if (estoque.contains(b))
				{
					estoque.remove(b);
				}
				else
				{
					System.out.println("\nItem não encontrado.");
				}
				
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o item que deseja atualizar:");
				String checar = ler.nextLine();
				System.out.println("\nDigite o item que entrará no lugar do item "+ checar +" .");
				String novo = ler.nextLine();
				
				System.out.println("\n"+estoque);
				
				break;
				
			case 4:
				System.out.println("\nOs itens do estoque são: ");
				System.out.println(estoque);
				break;
				
				default: System.out.println("\nPrograma finalizado.");
			}
			
		} while (x!=5);
		
	}

}