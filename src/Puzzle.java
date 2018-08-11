import util.Matriz;

import java.util.ArrayList;
import java.util.List;

public class Puzzle {

    private static final int[][] matrizSolucao = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    private int[][] matrizProblema;
    private List<No> nos = new ArrayList<No>();


    public Puzzle(int[][] matrizProblema) {
        this.matrizProblema = matrizProblema;
    }

    public void start() {
        System.out.println("Matriz problema: ");
        Matriz.print(matrizProblema);

        No no = new No(null, matrizProblema);
        addNovoNo(no);


        No noFilho = null;
        int cont = 0;
        while (nos.size() > 0) {
            cont++;
            noFilho = nos.get(0);
            nos.remove(0);

            boolean eIgual = Matriz.isEquals(noFilho.getMatrizProblema(), matrizSolucao);
            if (eIgual == true) {
                break;
            } else {
                gerarFilhos(noFilho);
                // nos.add(noFilho);
            }
        }
        System.out.println("ACHOU! Interações: " + cont);
        String resultado = "";
        while (true) {
            resultado = Matriz.concatResult(resultado, noFilho.getMatrizProblema());
            noFilho = noFilho.getNoPai();
            if (noFilho == null) {
                break;
            }
        }
        System.out.println(resultado);
    }


    public void addNovoNo(No no) {
        if (jaTemNoSemelhante(no) == false) {
            nos.add(no);
        }
    }

    public boolean jaTemNoSemelhante(No no) {
        boolean resposta = false;
        for (int i = 0; i < nos.size(); i++) {
            if (Matriz.isEquals(nos.get(i).getMatrizProblema(), no.getMatrizProblema())) {
                resposta = true;
                break;
            }
        }
        return resposta;
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
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

        }
        if (linha == 0 && coluna == 1) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);
        }
        if (linha == 0 && coluna == 2) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

        }
        if (linha == 1 && coluna == 0) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

        }
        if (linha == 1 && coluna == 1) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);
        }
        if (linha == 1 && coluna == 2) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha + 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);
        }
        if (linha == 2 && coluna == 0) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);
        }
        if (linha == 2 && coluna == 1) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna + 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);
        }
        if (linha == 2 && coluna == 2) {
            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha, coluna - 1, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);

            novaMatriz = Matriz.clone(no.getMatrizProblema());
            novaMatriz = Matriz.permute(linha, coluna, linha - 1, coluna, novaMatriz);
            noAux = new No(no, novaMatriz);
            no.addFilho(noAux);
            addNovoNo(noAux);
        }
        // no.printFilhos();
        return no;

    }

}
