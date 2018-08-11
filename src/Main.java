public class Main {

    private static final int[][] matrizProblema = {{2, 5, 3}, {6, 0, 8}, {1, 4, 7}};

    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle(matrizProblema);
        puzzle.start();
    }


}
