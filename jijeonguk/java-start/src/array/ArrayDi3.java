package array;

import java.util.Scanner;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.

        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[4][4];

        // arr[0][0] = 1;
        // System.out.println(arr[0][0]);

        // 값을 넣고
        int i = 1;
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i ++;
            }
        }

        // 출력한다.
        for (int column = 0; column < arr.length; column++) {
            for (int row = 0; row < arr[column].length; row++) {
                System.out.print(arr[column][row] + " ");
            }
            System.out.println();
        }
    }
}
