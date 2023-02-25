public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int summ = 1100;
        int limit = 1000;
        int bonus = 0;
        int res = summ + balans;
        if (summ < limit) {
            bonus = 0;
        } else {
            bonus = summ / 100;
        }
        if (res > limit) {
            System.out.println("Сумма на счету: " + (res + bonus));
            System.out.println("Сумма бонусов: " + bonus);
        } else {
            System.out.println("Сумма на счету: " + (summ + balans));
            System.out.println("Сумма бонусов: " + bonus);
        }
    }
}