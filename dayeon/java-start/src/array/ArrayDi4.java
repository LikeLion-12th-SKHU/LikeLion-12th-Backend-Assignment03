package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행2, 열3

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        //2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
