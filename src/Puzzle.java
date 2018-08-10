import util.Matriz;

public class Puzzle {

    private static final int[][] matrizSolucao = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    private int[][] matrizProblema;

    public Puzzle(int[][] matrizProblema) {
        this.matrizProblema = matrizProblema;
    }

    public void start() {
        System.out.println("Matriz problema: ");
        Matriz.print(matrizProblema);

        No no = new No(null, matrizProblema);

        no = gerarFilhos(no);

        while (no.getFilhos().size() != 0) {
            No noFilho = no.getFilhos().get(0);
            System.out.println("Filho " + no.getFilhos().size());
            no.getFilhos().remove(0);
            gerarFilhos(noFilho);


        }


    }

    private No gerarFilhos(No no) {
        int[] m = Matriz.findZero(no.getMatrizProblema());

        int linha = m[0];
        int coluna = m[1];
        No noAux = null;
        int novaMatriz[][] = null;
        if (linha == 0 && coluna == 0) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        if (linha == 0 && coluna == 1) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        if (linha == 0 && coluna == 2) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

        }
        if (linha == 1 && coluna == 0) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

        }
        if (linha == 1 && coluna == 1) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        if (linha == 1 && coluna == 2) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        if (linha == 2 && coluna == 0) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        if (linha == 2 && coluna == 1) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        if (linha == 2 && coluna == 2) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
        }
        no.printFilhos();
        return no;

    }

}
