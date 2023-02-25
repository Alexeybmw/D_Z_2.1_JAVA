public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int summ = 1100;
        int limit = 1000;
        int bonus = summ / 100;
        int res = summ + balans;
        if (res > limit) {
            System.out.println("Сумма на счету: " + ( res + bonus));
        }
        else {
            System.out.println("Сумма на счету: " + (summ + balans));
        }
    }
}