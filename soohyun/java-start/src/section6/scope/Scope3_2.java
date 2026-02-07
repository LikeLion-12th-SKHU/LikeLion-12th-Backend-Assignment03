package section6.scope;

public class Scope3_2 {
	public static void main(String[] args) {
		int m = 10; //생각 할 범위가 줄어들어 좋은 코드가 된다.
		if (m > 0) {
			int temp = m*2;
			System.out.println("temp = " + temp);
		}
		System.out.println("m = "+ m );
	}
}
