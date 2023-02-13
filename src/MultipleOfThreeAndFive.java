/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5
 * below the number passed in. Additionally, if the number is negative,
 * return 0 (for languages that do have them).
 * <p>
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */

public class MultipleOfThreeAndFive {

    static int mult(int value) {
        int sum = 0;
        if (value < 3) {
            return sum;
        } else {
            for (int i = 3; i < value; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
