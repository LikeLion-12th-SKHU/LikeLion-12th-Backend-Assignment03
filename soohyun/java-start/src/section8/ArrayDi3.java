package section8;

public class ArrayDi3 {
	public static void main(String[] args) {
		//2 *3 2차원 배열을 만든다.
		int[][] arr = new int[][]{
			{1,2,3},
			{4,5,6}
		}; // 행2,열3

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println(arr[row][col] + " "); //0열 출력
				System.out.println();
			}
		}
	}
}
