package Chapter09;

public class Method03 {
    public static void hi() {
        System.out.println("안녕하세요.\n");
        return;
    }

    public static void main(String[] args) {

        hi();
    }
}
/*
안녕하세요.
java: incompatible types: void cannot be converted to java.lang.String
 */