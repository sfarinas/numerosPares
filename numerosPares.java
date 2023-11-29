package arranjoPar;

import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int qtdPar = 0;
		
		System.out.println("Quantos numero vc ira digitar : ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero : ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES : ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				qtdPar ++;
				System.out.println(vect[i] + " | ");
			}
		}
		System.out.println("QUANTIDADE DE PARES : " + qtdPar);
		sc.close();
	}

}
