import java.util.*;
import java.lang.*;
import java.io.*;

// 1. Dada uma matriz A qualquer, imprima a sua transposta A^T.
class Main {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0;i < A.length;i++){
            System.out.println();
            for(int j = 0;j < A[i].length;j++){
                System.out.print(A[j][i] + " ");
            }
        }
    }
}
