public class Main {

    public static void main(String[] args) {

        System.out.println( sumOdd(100, 1000));

    }

    public static boolean isOdd (int number) {

        if (number <= 0) {
            return false;
        }

        int isEvenNumber = number % 2;

        if (isEvenNumber > 0) {
            return true;
        } else return false;
    }

    public static int sumOdd (int start, int end) {
        if (start < 0 || end < start) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }

        }
        return sum;
    }
}
