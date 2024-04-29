package Chapter06;

public class Scope3_1 {
    public static void main(String[] args) { //temp, m 할당
        int m = 10, temp;
        if(m > 0){
            temp= m * 2;
            System.out.printf("temp = %d\n",temp);
        }
        System.out.printf("m = %d\n",m);
    }// m, temp, a 종료
}
/*
temp = 20
m = 10
 */