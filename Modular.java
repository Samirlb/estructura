package modular;

import java.util.*;
public class Modular {

    public static void main(String[] args) {
        llenado();

    }

    public static void llenado() {
        Scanner sc = new Scanner(System.in);
        int x, y, i, j, suma, c;
        System.out.println("Digite el tamaño de la matriz");
        System.out.println("Filas : ");
        x = sc.nextInt();
        System.out.println("Columnas : ");
        y = sc.nextInt();
        int matriz[][] = new int[x][y];
        suma = x + y;
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.println("Llene la siguiente matriz : ");
                System.out.println("Posicion : [" + i + "]" + "[" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        vectorllenado(matriz, suma, x, y);
    }

    public static void vectorllenado(int matriz[][], int suma, int x, int y) {
        int vector[] = new int[suma];
        int c, i, j;
        c = 0;
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                vector[c] = matriz[i][j];
                c++;
            }

        }
        for (i = 0; i < suma; i++) {
            System.out.println("El vector es [" + vector[i] + "]");
        }
    }

}
