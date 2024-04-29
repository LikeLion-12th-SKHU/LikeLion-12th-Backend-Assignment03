package section9;

public class MethodCasting2 {
	public static void main(String[] args) {
		double number = 100;
		printNumber(number); //double형에 int 넣는건 아무 문제없다.
	}

	public static void printNumber(double n){
		System.out.println("숫자: "+n);
	}
}
