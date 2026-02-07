package section6.scope;

public class Scope3_3 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // while 문은 구조적으로 별로인게 scope를 비효율적으로 쓸수밖에 없다. i를 반목문에서 계속 만들 수 없기 때문.
		int endNum = 3;

		while (i <= endNum){
			sum = sum + i;
			System.out.println("i=" + i + " sum=" + sum);
			i++;
		}
	}
}
//변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다.
//좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
//무한한 자유는 무한한 버그를 만들어낸다.
