package Generation;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> estoque = new ArrayList<String>();
		
		do
		{
			System.out.println("-----------------------------------------");
			System.out.println("-----------------------------------------");
			System.out.println("\n(1) Deseja Adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja Remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar a opera��o?");
			System.out.println("-----------------------------------------");
			System.out.println("-----------------------------------------");
			System.out.println("\n\tDigite sua op��o:");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto n�o encontrado.");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar?");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o novo nome do produto para: "+verifica+".");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto "+verifica+" n�o encontrado.");
					
				}
				System.out.println("\n"+estoque);
				break;
			case 4:
				System.out.println("\nOs produtos que temos no estoque s�o: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOpera��o Finalizada.");
				}
		}while(op!=0);
		
		

	}

}