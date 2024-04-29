package section6.scope;

public class Scope2 {
	public static void main(String[] args) { // 블록 내부, for문 내
		int m = 10;
		for (int i=0;i<2;i++){ // for문이 끝나면 i는 살 수 없다.
			System.out.println("for m = "+m); //블록 내부에서 외부는 접근 가능
			System.out.println("for i = "+i);
		} // i 생존 종료
		// System.out.println(i);
		System.out.println("main m = "+ m);
	}
}
