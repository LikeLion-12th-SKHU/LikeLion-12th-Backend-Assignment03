package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        StringBuilder log = new StringBuilder();

        balance = deposit(balance, 1000, log);
        balance = withdraw(balance, 2000, log);

        log.append("최종 잔액: ").append(balance).append("원\n");
        System.out.println(log);
    }

    public static int deposit(int balance, int amount, StringBuilder log) {
        balance += amount;
        log.append(amount).append("원을 입금하였습니다. 현재 잔액: ").append(balance).append("원\n");
        return balance;
    }

    public static int withdraw(int balance, int amount, StringBuilder log) {
        if (balance >= amount) {
            balance -= amount;
            log.append(amount).append("원을 출금하였습니다. 현재 잔액: ").append(balance).append("원\n");
        } else {
            log.append(amount).append("원을 출금하려 했으나 잔액이 부족합니다.\n");
        }

        return balance;
    }
}
