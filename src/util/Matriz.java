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

    public static boolean isEquals(int[][] matrizProblema, int[][] matrizSolucao) {
        boolean eIgual = true;
        String a = "";
        String b = "";
        for (int i = 0; i < matrizProblema.length; i++) {
            for (int j = 0; j < matrizProblema.length; j++) {
                a = a + matrizProblema[i][j] + " ";
                b = b + matrizSolucao[i][j] + " ";

                if (matrizProblema[i][j] != matrizSolucao[i][j]) {
                    eIgual = false;
                }
            }
        }
        //System.out.println("Comparacao " +eIgual+" de "+a+" | "+b);
        return eIgual;
    }

    public static String concatResult(String r, int[][] matrizSolucao) {
        String aux = "";
        for (int i = 0; i < matrizSolucao.length; i++) {
            for (int j = 0; j < matrizSolucao.length; j++) {
                aux = aux + matrizSolucao[i][j]+"  ";
            }
            aux = aux + "\n";
        }
        r = aux + "\n" + r;
        return r;
    }
}
