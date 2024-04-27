package scope;

public class Scope1 {
    public static void main(String[] args) {
        // 지역변수는 자신이 선언된 코드 블록 { } 안에서만 생존하고,
        // 자신이 선언된 코드 블록을 벗어나면 제거된다. 따라서 이후에는 접근이 불가하다.
        int a = 10; // a 생존 시작
        if (true){
            int x = 20; // x 생존 시작
            System.out.println("if a = " + a);
            System.out.println("if x = " + x);
        }
        // System.out.println("main x = " + x); //오류, 변수 x에 접근 불가 컴파일 오류 발생
        // x 생존 종료
    } // a 생존 종료
}
