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
                    System.out.print("Digite o número de linhas da matriz: ");
                    int linhas = scanner.nextInt();
                    System.out.print("Digite o número de colunas da matriz: ");
                    int colunas = scanner.nextInt();
            
                    double[][] A = new double[linhas][colunas];
            
                    System.out.println("Digite os elementos da matriz:");
                    for (int j = 0; j < linhas; j++) {
                        for (int k = 0; k < colunas; k++) {
                            A[j][k] = scanner.nextDouble();
                        }
                    }
                    for (int j = 0; j < linhas; j++) {
                        for (int k = 0; k < colunas; k++) {
                            A[j][k] *= escalar;
                            System.out.print(A[j][k] + " ");
                        }
            			System.out.println();
                    }
                    break;
        		case 2:
                    
            		break;
            default:
            }
            
        }
    }
}
