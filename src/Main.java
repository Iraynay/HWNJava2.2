public class Main {
    public static void main(String[] args) {
        int status;
        // изначальное состояние счета
        int refill;
        int bonus1;
        int bonus2 = 0;
        bonus1 = 0;
        status = 100;
        refill = 1020;
        if (refill >= 1000) {
            bonus2 = refill / 100;
        }
        ;
        int bonus = bonus1 + bonus2;
        int balance = status + refill + bonus;
        System.out.println(
                "Your balance=" + balance);
        System.out.println(
                "Bonus=" + bonus);

    }
}
