public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 1100;
        int amountForBonus = 1000;
        int sumBonus;
        if (amount >= amountForBonus) {
            System.out.println("Количество денег на счету: " + (account + amount + amount / 100));
            System.out.println("Сумма бонуса: " + amount / 100);
        } else {
            System.out.println("Количество денег на счету: " + (account + amount));
        }
    }
}
