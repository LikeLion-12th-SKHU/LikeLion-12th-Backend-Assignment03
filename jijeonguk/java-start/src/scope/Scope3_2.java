package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        // 스코프(범위) 존재 이유
        // 1. 비효울적인 메모리 사용 temp는 if문 안에서만 사용할 것이기 때문에
        // 굳이 main 코드 블록이 종료 될 때까지 메모리를 사용할 이유가 없다
        // 2. 코드 복잡성
        // temp 는 if 코드 블록 안에서만 필요하고, 여기서만 사용하면 된다.
        // 그렇기 때문에 if 코드 블록안에 선언되었다면, if가 끝나고
        // temp에 대한 생각을 전혀 안해도 된다.
        int m = 10;

        if (m > 0) {
            int temp = 0; // 스코프 줄이기
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
