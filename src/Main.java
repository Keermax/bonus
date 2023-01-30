public class Main {
    public static void main(String[] args) {
        int amount = 1350;
        int score = 12;
        int bonus = 1;
        if (amount < 1000) {
            System.out.println(score + " сумма бонусов ");
        }
        if (amount >= 1000) {
            System.out.println((score) + " счет до пополнения ");
            System.out.println((amount / 100 * bonus) + " сумма бонуса ");
            System.out.println((amount / 100 * bonus) + score + " счет после пополнения ");
        }
    }
}