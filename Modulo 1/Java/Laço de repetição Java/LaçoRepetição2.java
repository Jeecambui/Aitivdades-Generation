import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) 

public class La�oRepeti��o2 {

	public static void main(String[] args) {
		

		int num, somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		numero = leia.nextInt();
		
		do
		{
			if(numero%2==0)
			{
				somaNumero += numero;
				contNumero++;
			}
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();
			
		}while(numero%2==0);
		
		if(contNumero==0)
		{
			System.out.println("\nN�o � poss�vel fazer divis�o por zero!!!");
		}
		else
		{
		media = somaNumero / contNumero;
		System.out.println("\nM�dia dos n�meros pares: "+media);
		}
	}

}

