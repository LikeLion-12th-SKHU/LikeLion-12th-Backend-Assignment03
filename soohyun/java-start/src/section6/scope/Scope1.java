package section6.scope;

import java.util.SortedMap;

public class Scope1 {

	public static void main(String[] args){
		int m = 10; //m 생존 시작
		if (true){
			int x = 20;
			System.out.println("if m = "+ m);
			System.out.println("if x = "+ x);
		} //x 생존 종료.
		// System.out.println("main x = "+ x); x는 생존할 수 없다.
		System.out.println("main x = "+ m);
	} //m 생존 종료.
}
/*
이렇게 접근 가능한 범위를 스코프라고 한다.
 */