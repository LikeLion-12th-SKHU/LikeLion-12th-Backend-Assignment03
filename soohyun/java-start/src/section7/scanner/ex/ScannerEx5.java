package section7.scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int b = sc.nextInt();

		if (a > b){
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i=a;i<=b;i++){
			System.out.print(i);
			if (i != b){
				System.out.print(",");
			}
		}
	}
}
