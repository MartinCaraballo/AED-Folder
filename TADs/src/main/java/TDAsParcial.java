/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


/**
 *
 * @author juan-
 */
public class TDAsParcial {

    public static Integer[][] P = new Integer[5][5];

    public static void main(String[] args) {
        Integer[][] C = new Integer[5][5];
        C[0][0] = 0;
        C[0][1] = null;
        C[0][2] = 1;
        C[0][3] = 4;
        C[0][4] = null;

        C[1][0] = 6;
        C[1][1] = 0;
        C[1][2] = null;
        C[1][3] = null;
        C[1][4] = 3;

        C[2][0] = null;
        C[2][1] = 2;
        C[2][2] = 0;
        C[2][3] = null;
        C[2][4] = 1;

        C[3][0] = null;
        C[3][1] = null;
        C[3][2] = 5;
        C[3][3] = 0;
        C[3][4] = null;

        C[4][0] = 3;
        C[4][1] = null;
        C[4][2] = null;
        C[4][3] = null;
        C[4][4] = 0;

        boolean[][] C2 = new boolean[6][6];
        C2[0][0] = false;
        C2[0][1] = true;
        C2[0][2] = true;
        C2[0][3] = true;
        C2[0][4] = false;
        C2[0][5] = false;

        C2[1][0] = false;
        C2[1][1] = false;
        C2[1][2] = false;
        C2[1][3] = false;
        C2[1][4] = false;
        C2[1][5] = true;

        C2[2][0] = false;
        C2[2][1] = false;
        C2[2][2] = false;
        C2[2][3] = false;
        C2[2][4] = true;
        C2[2][5] = false;

        C2[3][0] = false;
        C2[3][1] = false;
        C2[3][2] = false;
        C2[3][3] = false;
        C2[3][4] = true;
        C2[3][5] = false;

        C2[4][0] = false;
        C2[4][1] = false;
        C2[4][2] = false;
        C2[4][3] = false;
        C2[4][4] = false;
        C2[4][5] = true;

        C2[5][0] = false;
        C2[5][1] = false;
        C2[5][2] = true;
        C2[5][3] = false;
        C2[5][4] = false;
        C2[5][5] = false;

        Integer[][] A = new Integer[5][5];
        boolean[][] A2 = new boolean[6][6];

        P[0][0] = 0;
        P[0][1] = 0;
        P[0][2] = 0;
        P[0][3] = 0;
        P[0][4] = 0;

        P[1][0] = 0;
        P[1][1] = 0;
        P[1][2] = 0;
        P[1][3] = 0;
        P[1][4] = 0;

        P[2][0] = 0;
        P[2][1] = 0;
        P[2][2] = 0;
        P[2][3] = 0;
        P[2][4] = 0;

        P[3][0] = 0;
        P[3][1] = 0;
        P[3][2] = 0;
        P[3][3] = 0;
        P[3][4] = 0;

        P[4][0] = 0;
        P[4][1] = 0;
        P[4][2] = 0;
        P[4][3] = 0;
        P[4][4] = 0;

        algoritmoFloyd(A, C);
        algoritmoWarshall(A2, C2);
        System.out.println("Lala");
    }

    public static void algoritmoFloyd(Integer[][] A, Integer[][] C) {
        //Iniciacion de A
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = C[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            A[i][i] = 0;
        }

        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (A[i][k] != null && A[k][j] != null) {
                        if (A[i][j] == null) {
                            A[i][j] = A[i][k] + A[k][j];
                            P[i][j] = k;
                        } else {
                            if (A[i][k] + A[k][j] < A[i][j]) {
                                A[i][j] = A[i][k] + A[k][j];
                                P[i][j] = k;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void algoritmoWarshall(boolean[][] C, boolean[][] A) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = C[i][j];
            }
        }
        for (int k = 0; k < 6; k++) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if(A[i][j] == false)
                    {
                        A[i][j] = A[i][k] && A[k][j];
                    }
                }
            }
        }
    }

}
