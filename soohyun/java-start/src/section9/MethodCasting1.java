package section9;

public class MethodCasting1 {
	public static void main(String[] args) {
		double number = 1.5;
		//printNumber(number); double을 int에 넣으려고해서 컴파일 오류남.
		printNumber((int) number);
	}

	public static void printNumber(int n){
		System.out.println("숫자: "+n);
	}
}
