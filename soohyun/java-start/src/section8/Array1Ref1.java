package section8;

public class Array1Ref1 {
	public static void main(String[] args) {
		int[] students; //배열 변수 선언 배열 변수라는 것은 이 자체가 배열이 아니라 진짜 배열을 넣을 수 있는 공간이 만들어지는 것.

		students = new int[5]; //새로운 배열을 넣으면 그 배열의 참조값을 배열변수에 저장한다.

		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		//변수값 사용.

		System.out.println("학생 2 점수: "+ students[1]);
		System.out.println("학생 3 점수: "+ students[2]);
		System.out.println("학생 4 점수: "+ students[3]);
		System.out.println("학생 5 점수: "+ students[4]);

	}
}
