package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; //int / int
        System.out.println("div1 = " + div1); //1 //int / int이므로 int 타입 결과

        double div2 = 3 / 2; //int / int
        System.out.println("div2 = " + div2); //1.0 //int / int로 1이라는 값이 나왔으나 double로 자동 형변환, double 타입 결과

        double div3 = 3.0 / 2; //double / int
        System.out.println("div3 = " + div3); //1.5 //double / int -> double / double로 형변환, double 타입 결과

        double div4 = (double) 3 / 2; //(double) int / int
        System.out.println("div4 = " + div4); //1.5 //(double) int / int -> double / double로 형변환, double 타입 결과

        int a = 3;
        int b = 2;
        double result = (double) a / b; //(double) int / int -> double / double로 형변환
        System.out.println("result = " + result); //1.5
    }
}
