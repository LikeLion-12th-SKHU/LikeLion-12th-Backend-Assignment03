package Chapter06;

public class Scope3_2 {
    public static void main(String[] args) { //m 할당
        int m = 10;
        if(m > 0){ // temp 할당
            int temp= m * 2;
            System.out.printf("temp = %d\n",temp);
        } // temp 종료
        System.out.printf("m = %d\n",m);
    }// m 종료
}
/*
temp = 20
m = 10
 */