package Chapter06;

public class Scope2 {

    public static void main(String[] args)// a가 할당되는 영역
    {
        int a = 10;

        for (int i = 1; i <= 5; i++){ // i가 할당되는 영역, i, j에 접근 가능함
            for (int j = 0; j < i; j++){ // j가 할당되는 영역
                System.out.print("*");
            }
            //j가 종료되는 영역
            System.out.print("\n");
        } // i가 종료되는 영역
        System.out.printf("%d", a);
    } //a가 종료되는 영역
}
/*
*
**
***
****
*****
10
 */