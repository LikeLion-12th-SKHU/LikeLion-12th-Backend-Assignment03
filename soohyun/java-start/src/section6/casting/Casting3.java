package section6.casting;

public class Casting3 {
	public static void main(String[] args) {
		long maxIntValue = 2147483647; //int 최고값
		long maxIntOver = 2147483648L; //int 최고값
		int intValue = 0;

		intValue = (int) maxIntValue; //형변환
		System.out.println("maxIntValue catsing = "+ intValue); //이때는 문제가 안된다.
		intValue = (int) maxIntOver; //형변환
		System.out.println("maxIntValue catsing = "+ intValue); //이때는 문제가 안된다. -2147483648 1씩 증가시키면 Int의 가장 작은 범위부터 시작 시계처럼
	}
}
