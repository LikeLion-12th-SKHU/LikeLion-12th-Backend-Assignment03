package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(message).append("\n");
        }
        System.out.print(sb);
    }
}
