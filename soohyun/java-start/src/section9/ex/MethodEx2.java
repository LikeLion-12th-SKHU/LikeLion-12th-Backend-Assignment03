package section9.ex;

public class MethodEx2 {
	public static void main(String[] args) {

		printMessage("Hello, world!", 3);
		printMessage("java", 5);
		printMessage("아오 동재시치", 7);

	}

	public static void printMessage(String message, int times){
		for (int i=0; i< times;i++){
			System.out.println(message);
		}
	}
}
