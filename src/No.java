import java.util.ArrayList;
import java.util.List;

public class No {
    private int [][]matrizProblema;
    private List<No> filhos;

    public No(int[][] matrizProblema) {
        this.matrizProblema = matrizProblema;
        this.filhos=new ArrayList<>();
    }

    public void addFilhos(No no){
        filhos.add(no);
    }

}
