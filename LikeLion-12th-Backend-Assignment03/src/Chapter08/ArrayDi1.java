package Chapter08;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] Array1 = new int[2][3];

        Array1[0][0] = 100;
        Array1[0][1] = 354;
        Array1[0][2] = 12;
        Array1[1][0] = 54;
        Array1[1][1] = 90;
        Array1[1][2] = 65;

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
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
