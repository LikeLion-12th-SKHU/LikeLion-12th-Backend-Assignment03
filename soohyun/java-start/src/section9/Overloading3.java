package section9;

public class Overloading3 {
	public static void main(String[] args) {
		System.out.println("1: "+ add(1,2));
		System.out.println("2: "+add(1.2,1.5));
	}
	public static int add(int a, int b){
		System.out.println("1번호출");
		return a+b;

	}
//주석처리해도 형변환으로 해도 된다. 하지만 본인에 맞는 메서드부터 찾게 해서 맞는 함수를 호출하게 한다.
	// 즉 먼저 자신의 타입등에 맞는 함수가 있는지 체크 -> 형변환 가능한거 있는지 체크
	public static double add(double a, double b){
		System.out.println("2번호출");
		return a+b;
	}
}
