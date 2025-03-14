package br.edu.fatecpg.vetor;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		String[][] alunosNotas = new String[2][2];
		Scanner scan = new Scanner(System.in);

		
		for(int l=0; l<2; l++) {
			for(int c=0; c<2; c++) {
				System.out.println("" + "Digite o valor para a linha: " + (l+1) + "Digite o valor para a coluna: " + (c+1));
				alunosNotas[l][c] = scan.nextLine();
			}
		}
		

		System.out.println("Quem está na linha 2 " + "e na coluna 1 \n" + alunosNotas[1][0]);
	}

}
