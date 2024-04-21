package method.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx4 {
    private static final int DEPOSIT = 1, WITHDRAW = 2, CHECK_BALANCE = 3, EXIT = 4;

    public static void main(String[] args) throws IOException {
        int balance = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            printMenu();

            int choice = Integer.parseInt(br.readLine());
            int amount;

            switch (choice) {
                case DEPOSIT:
                    System.out.print("입금액을 입력하세요: ");
                    amount = Integer.parseInt(br.readLine());
                    balance = deposit(balance, amount);
                    break;
                case WITHDRAW:
                    System.out.print("출금액을 입력하세요: ");
                    amount = Integer.parseInt(br.readLine());
                    balance = withdraw(balance, amount);
                    break;
                case CHECK_BALANCE:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case EXIT:
                    System.out.println("시스템을 종료합니다.");
                    br.close();
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    private static void printMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------\n")
                .append("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n")
                .append("----------------------------------\n")
                .append("선택: ");
        System.out.print(sb);
    }

    private static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    private static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

/*      int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case DEPOSIT:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case WITHDRAW:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case CHECK_BALANCE:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case EXIT:
                    System.out.println("시스템을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    private static void printMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------\n")
                .append("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n")
                .append("----------------------------------\n")
                .append("선택: ");
        System.out.print(sb);
    }

    private static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    private static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
*/
}
