package array;

public class Array1 {
    public static void main(String[] args) {

        //new int[5] 로 배열을 생성하면 배열의 크기만큼 메모리를 확보한다.
        //int 형을 5개 사용하면 4byte * 5 20byte 를 확보한다.
        //배열을 생성하고 나면 자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)( x001 )을 반환한다.
        //여기서 x001 이라고 표현한 것이 참조값이다. (실제로 x001 처럼 표현되는 것은 아니고 이해를 돕기 위한
        //예시이다.)
        //앞서 선언한 배열 변수인 int[] students 에 생성된 배열의 참조값( x001 )을 보관한다.
        //int[] students 변수는 new int[5] 로 생성한 배열의 참조값을 가지고 있다.
        //이 변수는 참조값을 가지고 있다. 이 참조값을 통해 배열을 참조할 수 있다. 쉽게 이야기해서 참조값을 통해
        //메모리에 있는 실제 배열에 접근하고 사용할 수 있다.
        //참고로 배열을 생성하는 new int[5] 자체에는 아무런 이름이 없다! 그냥 int 형 변수를 5개 연속으로
        //만드는 것이다. 따라서 생성한 배열에 접근하는 방법이 필요하다. 따라서 배열을 생성할 때 반환되는 참조값
        //을 어딘가에 보관해두어야 한다. 앞서 int[] students 변수에 참조값( x001 )을 보관해두었다. 이 변수
        //를 통해서 이 배열에 접근할 수 있다

        int [] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생 1 점수 : " + students[0]);
        System.out.println("학생 2 점수 : " + students[1]);
        System.out.println("학생 3 점수 : " + students[2]);
        System.out.println("학생 4 점수 : " + students[3]);
        System.out.println("학생 5 점수 : " + students[4]);
    }
}
