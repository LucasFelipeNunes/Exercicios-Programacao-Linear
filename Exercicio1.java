import java.util.*;
import java.lang.*;
import java.io.*;

// 1. Dada uma matriz A qualquer, imprima a sua transposta A^T.
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        double[][] A = new double[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("A matriz transposta é:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }
}
