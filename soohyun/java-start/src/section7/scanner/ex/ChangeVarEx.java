package section7.scanner.ex;

public class ChangeVarEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp; //a의값 10

		//시작: 코드를 작성하세요
		temp = a;
		a = b;
		b = temp;

		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
}
