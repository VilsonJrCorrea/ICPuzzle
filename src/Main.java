public class Main {

    private static final int[][] matriz = {{6, 2, 1}, {5, 8, 7}, {4, 3, -1}};

    public static void main(String[] args) {
        int x=0, y =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == -1) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(x+" "+y);

        print(matriz);
    }

    private static void print(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
