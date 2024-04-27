package method.ex;

public class MethodExRef3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 2000);
        balance = withdraw(balance, 8000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit (int balance ,int depositAcount){
        balance += depositAcount;
        System.out.println(depositAcount + "원을 입금하였습니다. 현재 잔액: "+ balance);
        return balance;
    }
    public static int withdraw (int balance ,int amount) {
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
