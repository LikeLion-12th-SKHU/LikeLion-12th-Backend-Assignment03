package section9;

public class Method1 {
	public static void main(String[] args) {
		//계산을 여러번한다고 치면 이 연산을 여러번 진행해야되니 코드를 중복해서 사용하게 된다.
		//이럴 때 함수를 정의해놓고 필요할 때마다 재사용하면 된다.
		int a = 1;
		int b = 2;
		System.out.println(a+" + "+ b + "연산 수행");
		int sum1= a+b;
		System.out.println("결과1 출력: "+ sum1);
	}
}
