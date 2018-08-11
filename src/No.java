import util.Matriz;

import java.util.ArrayList;
import java.util.List;

public class No {

    private int[][] matrizProblema;
    private List<No> filhos;
    private No noPai;

    public No(No noPai, int[][] matrizProblema) {
        this.matrizProblema = matrizProblema;
        this.filhos = new ArrayList<>();
        this.noPai = noPai;
    }

    public void addFilho(No no) {
        filhos.add(no);
    }

    public int[][] getMatrizProblema() {
        return matrizProblema;
    }


    public void printFilhos() {
        for (int i = 0; i < filhos.size(); i++) {
            Matriz.print(filhos.get(i).getMatrizProblema());
        }
    }

    public List<No> getFilhos() {
        return filhos;
    }

    public No getNoPai() {
        return noPai;
    }
}
