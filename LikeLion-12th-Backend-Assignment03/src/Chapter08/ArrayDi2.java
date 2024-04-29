package Chapter08;

public class ArrayDi2 {
    public static void main(String[] args) {
        int[][] Array1 = new int[][]{
                {100, 354, 12},
                {54, 90, 65}
        };

        for (int row = 0; row < Array1.length; row++) {
            for (int column = 0; column < Array1[row].length; column++) {
                System.out.printf("%s ", Array1[row][column]);
            }
            System.out.println();
        }
    }
}
/*
100 354 12
54 90 65
 */
