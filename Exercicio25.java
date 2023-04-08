package aula19_Arrays;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. 
		 * Construir um vetor B de mesmo tipo
		e tamanho, obedecendo as seguintes regras de formação:
		
		A) B, deverá receber 1 quando A, for par.
		b) B, deverá receber 0 quando A, for impar.*/
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int x=0;x<vetorA.length;x++) {
			vetorA[x] = (int) Math.round(Math.random() * 10);
			if(vetorA[x] % 2 == 0) {
				vetorB[x] = 1;
			}else if(vetorA[x] % 2 != 0) {
				vetorB[x] = 0;
			}
		}
		System.out.println();
		System.out.print("Vetor A = ");
		for(int x=0;x<vetorA.length;x++) {
			System.out.print(vetorA[x]+" ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int x=0;x<vetorB.length;x++) {
			System.out.print(vetorB[x]+" ");
		}
		
	}
}
