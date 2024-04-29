package Chapter06;

public class Scope1 {
    public static void main(String[] args) { // Var1의 생성
        int Var1 = 10;

        if(true){ // Var2의 생성
            int Var2 = 20;
            System.out.printf("<IF문 안쪽> \n%d \n%d \n", Var1, Var2);

        } // Var2의 종료
        //System.out.printf("%d",Var2); -> Var2가 메모리에서 할당이 제외되었기 때문에 에러가 뜬다.
        System.out.printf("<IF문 바깥쪽> \n%d \n", Var1);
    } // Var1의 종료
}
/*
<IF문 안쪽>
10
20
<IF문 바깥쪽>
10
 */