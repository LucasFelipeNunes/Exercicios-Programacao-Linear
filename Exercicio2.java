import java.util.*;
import java.lang.*;
import java.io.*;

/*
2. Escreva um programa Java para efetuar as seguintes operações com matrizes:
a. Multiplicação por escalar (rA).
b. Adição de matrizes (A + B).
c. Subtração de matrizes.
d. Multiplicação de matrizes (A • B e B • A).
Dica: Tome como base o programa do Exercício 1. Note, o Exercício 2 exige a declaração de duas matrizes A e B para efetuar as operações.
*/
class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	for(int i = 0;i != 5;){
		System.out.print("Escolha a operação com matriz desejada!\n\n1. Multiplicação por escalar (rA).\n2. Adição de matrizes (A + B).\n3. Subtração de matrizes.\n4. Multiplicação de matrizes (A • B e B • A).\n5. Sair\n\nDigite aqui: ");
		i = scanner.nextInt();
		switch (i) {
			case 1:
				System.out.print("Digite o número escalar: ");
				double escalar = scanner.nextDouble();
				double[][] A = geraMatriz('A');
				for (int j = 0; j < A.length; j++) {
					for (int k = 0; k < A[j].length; k++) {
						A[j][k] *= escalar;
						System.out.print(A[j][k] + " ");
					}
					System.out.println();
				}
				break;
			default:
				if(i == 5){
					break;
				}
				double[][] A2 = geraMatriz('A');
				double[][] B2 = geraMatriz('B');
				if(i == 4){
					if(A2[0].length != B2.length){
						System.out.println("Operação não definida; o número de colunas da primeira matriz é diferente do número de linhas da segunda.");
					}
					else{
						double[][] C2 = new double[A2.length][B2[0].length];
						for(int j = 0;j < C2.length;j++){
							for(int k = 0;k < C2[0].length;k++){
								// Escrever depois
							}
						}
					}
				}
				else{
					if(A2.length != B2.length || A2[0].length != B2[0].length){
						System.out.println("Operação não definida; as ordens das matrizes são diferentes");
					}
					else{
						double[][] C = new double[A2.length][A2[0].length];
						for (int j = 0; j < A2.length; j++) {
							for (int k = 0; k < A2[j].length; k++) {
								C[j][k] = A2[j][k] + B2[j][k] * ((i == 3) ? -1 : 1);
								System.out.print(C[j][k] + " ");
							}
							System.out.println();
						}
					}
	   			}
			}   
        }
	}

    public static double[][] geraMatriz(char a){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite o número de linhas da matriz" + a + ": ");
	    int linhas = scanner.nextInt();
	    System.out.print("Digite o número de colunas da matriz" + a + ": ");
	    int colunas = scanner.nextInt();
	
	    double[][] matriz = new double[linhas][colunas];
	
	    System.out.println("Digite os elementos da matriz " + a + ":");
	    for (int j = 0; j < linhas; j++) {
			for (int k = 0; k < colunas; k++) {
			    matriz[j][k] = scanner.nextDouble();
			}
	    }
		return matriz;
    }
}
