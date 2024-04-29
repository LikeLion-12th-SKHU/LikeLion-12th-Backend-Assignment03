package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int/int , 결과: 1.5
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; // int/int
        System.out.println("div2 = " +div2); // 자동형변환 발생 1(int) -> 1.0(double), 결과:1.0

        double div3 = 3.0 / 2; // double / int --> double / double 형변환 발생
        System.out.println("div3 = " +div3); // 결과:1.5

        double div4 = (double)3 / 2; // 명시적 형변환을 사용 (double) int / int
        System.out.println("div4 = " +div4); // double / double -> double , 결과: 1.5

        int a =3;
        int b =2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
    }
}
