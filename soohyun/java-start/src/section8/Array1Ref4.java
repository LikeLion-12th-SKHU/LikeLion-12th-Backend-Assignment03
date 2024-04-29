package section8;

public class Array1Ref4 {
	public static void main(String[] args) {
		int[] students = {90,80,70,60,50}; //배열 생성과 초기화. 이렇게도 쓸수있으나 라인을 나누면 인식을 못한다.
		//변수값 사용
		for (int i =0;i<students.length;i++){
			System.out.println("학생 "+ (i+1) + "점수: "+ students[i]);
		}
	}

}
