public class Main {
    public static void main(String[] args) {
        System.out.println("Баланс с учетом бонуса Получи рубль за каждые 100");
        int currentBalance = 80;
        int replenishmentAmount = 1000;
        int percent = 1;
        int bonus = replenishmentAmount * percent / 100;


        if (replenishmentAmount >= 1000) {
            System.out.println(bonus + replenishmentAmount + currentBalance);
        } else {
            System.out.println (replenishmentAmount + currentBalance);
        }

    }
}