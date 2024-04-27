package array;

public class ArrayRef1 {
    public static void main(String[] args) {

        int [] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        //참고: 리펙토링
        //리펙토링(Refactoring)은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를
        //용이하게 하는 과정을 뜻한다. 이는 중복을 제거하고, 복잡성을 줄이며, 이해하기 쉬운 코드로 만들기 위해 수행된
        //다. 리펙토링은 버그를 줄이고, 프로그램의 성능을 향상시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이
        //된다.
        //쉽게 이야기해서 작동하는 기능은 똑같은데, 코드를 개선하는 것을 리펙토링이라 한다
        for(int i =0; i < students.length ; i++){
            System.out.println("학생" +(i+1) +"점수: " + students[i]);
        }
    }
}
