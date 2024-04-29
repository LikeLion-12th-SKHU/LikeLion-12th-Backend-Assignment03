package section6.scope;

public class Scope3_1 {
	public static void main(String[] args) {
		int m = 10;
		int temp = 0; //임시로 잠깐 사용하는 앤데 얘를 메인 코드에서 선언을 하게 되면 생존 범위가 길어진다. 비효율적인 메모리 사용.
		if (m > 0) {
			temp = m * 2;
			System.out.println("temp = "+ temp);
		}
		System.out.println("m= " + m);
	}
}
// 나 말고 다른사람이 이 코드를 유지보수할 때 if문 다음으로 안쓰는 m이 있으면 코드의 복잡성이 증가한다.