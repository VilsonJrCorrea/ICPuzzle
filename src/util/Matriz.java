package util;

public class Matriz {

    public static int[] findZero(int[][] matriz) {
        int position[] = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    public static void print(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static int[][] permute(int linhaDoZero, int colunaDoZero, int linhaParaTroca, int colunaParaTrocar, int[][] matrizProblema) {
        for (int i = 0; i < matrizProblema.length; i++) {
            for (int j = 0; j < matrizProblema.length; j++) {
                if (i == linhaDoZero && j == colunaDoZero) {
                    int zero = matrizProblema[linhaDoZero][colunaDoZero];
                    int valor = matrizProblema[linhaParaTroca][colunaParaTrocar];
                    matrizProblema[linhaDoZero][colunaDoZero] = valor;
                    matrizProblema[linhaParaTroca][colunaParaTrocar] = zero;
                    break;
                }
            }
        }
//        print(matrizProblema);
        return matrizProblema;
    }

    public static int[][] clone(int[][] matrizProblema) {
        int novaMatriz[][] = new int[matrizProblema.length][matrizProblema.length];
        for (int i = 0; i < matrizProblema.length; i++) {
            for (int j = 0; j < matrizProblema.length; j++) {
                novaMatriz[i][j] = matrizProblema[i][j];
            }
        }
        return novaMatriz;
    }
}
