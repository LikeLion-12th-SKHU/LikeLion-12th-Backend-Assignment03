package section9;

public class MethodValue1 {
	public static void main(String[] args) {
		int num1 = 5;
		System.out.println("1. changeNumber 호출전,  num1: "+ num1);
		changeNumber(num1);
		System.out.println("4. changeNumber 호출 후,  num1: "+ num1);
	}

	public static void changeNumber(int num2){ //자바에서 모든 값 전달은 복사해서 준다. 원본을 넘기지 않는다.
		System.out.println("2. changeNumber 변경 전,  num1: "+ num2);
		num2 = num2 * 2;
		System.out.println("3. changeNumber 변경 후,  num1: "+ num2);

	}
}
