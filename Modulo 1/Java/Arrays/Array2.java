package Generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 

//� Os n�meros pares digitados;  
//A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.

public class Array2 {
	public static void main(String args[]) {

		Scanner leia = new Scanner(System.in);

		List<Integer> numerosImpares = new ArrayList<>();
		List<Integer> numerosPares = new ArrayList<>();

		int numero, somaPar = 0;

		System.out.print("\nPor gentileza digite 6 n�meros");
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\n\nDigite um n�mero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				numerosPares.add(numero);
				somaPar += numero;

			} else {
				numerosImpares.add(numero);
			}
		}
		System.out.println("/nN�meros pares digitados: " + numerosPares);
		System.out.println("Soma dos n�meros pares: " + somaPar);
		System.out.println("N�meros �mpares digitados: " + numerosImpares);
		System.out.println("Quantidade de �mpares digitados: " + numerosImpares.size());
	}
}
