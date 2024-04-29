package section8;

public class EnhancedFor1 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};

		for(int i=0;i<numbers.length;i++){
			int number = numbers[i];
			System.out.println(number);
		}

		//향상된 for문, for-each문
		for(int number : numbers){
			System.out.println(number);
		}

		//for-each문을 사용할 수 없는 경우, 증가하는 index값 필요.
		int i =0;
		for (int number : numbers){
			System.out.println("number" + i +"번의 결과는: "+number);
			i++;
		}
		//이렇게 억지로 할 수 있지만 이럴바에는 scope가 정해져있는 그냥 for문 쓰는 것이 훨씬 더 좋다.
	}
}

