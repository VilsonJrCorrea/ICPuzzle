public class Main {

    private static final int[][] matrizProblema = {{1, 2, 3}, {4, 0, 6}, {7, 5, 8}};

    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle(matrizProblema);
        puzzle.start();
    }


}
