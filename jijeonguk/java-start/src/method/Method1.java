package method;

public class Method1 {
    public static void main(String[] args) {
        //변수명 vs 메서드명
        //변수 이름은 일반적으로 명사를 사용한다. 한편 메서드는 무언가 동작하는데 사용하기 때문에 일반적으로 동사로 시작
        //한다.
        //이런 차이점 외에는 변수 이름과 메서드 이름에 대한 규칙은 둘다 같다.
        //변수명 예): customerName , totalSum , employeeCount , isAvailable
        //메서드명 예): printReport() , calculateSum() , addCustomer() , getEmployeeCount() ,
        //setEmployeeName()
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력:" + sum1);
        //계산2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력:" + sum2);
    }
}
