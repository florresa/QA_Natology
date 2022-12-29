public class Homework3_1 {
    public static void main(String[] args) {
        int sumOnAccount = 100;
        int sumOfRefill = 1100;
        int bonus = sumOfRefill / sumOnAccount;
        int result;
        if (sumOfRefill > 1000) {
            result = sumOnAccount + sumOfRefill + bonus;
        }
        else {
            result = sumOnAccount + sumOfRefill;
        }
        System.out.println(result);
    }
}
