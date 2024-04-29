package Chapter08;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] Array1 = new int[2][3];

        int a = 1;

        for (int row = 0; row < Array1.length; row++){
            for (int column = 0; column < Array1[row].length; column++){
                Array1[row][column] = a++;
            }
        }

        for (int row = 0; row < Array1.length; row++) {
            for (int column = 0; column < Array1[row].length; column++) {
                System.out.printf("%s ", Array1[row][column]);
            }
            System.out.println();
        }
    }
}