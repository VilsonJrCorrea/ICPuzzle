import util.Matriz;

public class Puzzle {

    private static final int[][] matrizSolucao = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    private int[][] matrizProblema;

    public Puzzle(int[][] matrizProblema) {
        this.matrizProblema = matrizProblema;
    }

    public void start() {

        No no = new No(matrizProblema);
        int[] m = Matriz.findZero(matrizProblema);

        int linha = m[0];
        int coluna = m[1];

        No noAux = null;
        int novaMatriz[][] = null;
        Matriz.print(matrizProblema);
        if (linha == 0 && coluna == 0) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
        if (linha == 0 && coluna == 1) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
        if (linha == 0 && coluna == 2) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

        }
        if (linha == 1 && coluna == 0) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

        }
        if (linha == 1 && coluna == 1) {
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
        if (linha == 1 && coluna == 2) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
        if (linha == 2 && coluna == 0) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
        if (linha == 2 && coluna == 1) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
        if (linha == 2 && coluna == 2) {
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);

            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, matrizProblema);
            noAux = new No(novaMatriz);
            no.addFilhos(noAux);
        }
//        Matriz.print(matrizProblema);


    }


}
