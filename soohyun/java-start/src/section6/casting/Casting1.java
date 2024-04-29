package section6.casting;

public class Casting1 {
	public static void main(String[] args) {
		int intValue = 10;
		long longValue;
		double doubleValue;

		longValue = intValue; // int -> long
		System.out.println("longValue = "+ longValue);

		doubleValue = intValue; // int -> double
		System.out.println("doubleValue = "+ doubleValue);

		doubleValue = 20L; //long -> double (double)을 자바가 자동으로 해주는 모습.
		System.out.println("doubleValue2 = "+ doubleValue);
	}
}
