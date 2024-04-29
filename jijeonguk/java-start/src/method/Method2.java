package method;

public class Method2 {
    public static void main(String[] args) {
        // 매개변수가 없거나 반환 타입이 없는경우.

        //반환 타입이 없는 경우
        //선언: public static void printHeader() 와 같이 반환 타입을 void 로 정의하면 된다.
        //호출: printHeader(); 와 같이 반환 타입이 없으므로 메서드만 호출하고 반환 값을 받지 않으면 된다.
        //String str = printHeader(); 반환 타입이 void 이기 때문에 이렇게 반환 값을 받으면 컴파일 오류가 발생한다
        printHeader();
        printFooter();
    }

    // 매개 변수가 없고, 반환 타입도 없는 경우
    public static void printHeader(){
        System.out.println("프로그램을 시작합니다.");
        return;
    }

    public static void printFooter() {
        System.out.println("프로그램을 종료합니다.");
        // 자바가 반환 타입이 없는 경우에는 return을 마지막 줄에 넣어준다.
        // 참고로 return을 만나면 해당 메서드는 종료된다.
    }
}
