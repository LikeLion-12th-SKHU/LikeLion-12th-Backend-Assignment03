package Chapter08;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] Array1= new int[2][3];

        Array1[0][0] = 100;
        Array1[0][1] = 354;
        Array1[0][2] = 12;
        Array1[1][0] = 54;
        Array1[1][1] = 90;
        Array1[1][2] = 65;

        System.out.print(Array1[0][0] + " ");
        System.out.print(Array1[0][1] + " ");
        System.out.print(Array1[0][2] + " \n");
        System.out.print(Array1[1][0] + " ");
        System.out.print(Array1[1][1] + " ");
        System.out.print(Array1[1][2] + " ");

    }
}
/*
100 354 12
54 90 65
 */
