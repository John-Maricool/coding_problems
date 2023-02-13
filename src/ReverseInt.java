/**
 * Write a java function that reverses an integer
 *
 * 1234 / 10 = 123 r 4
 * 123 / 10 = 12 r 3
 * 12 /10 = 1 r 2
 * 1 / 10 = 0 r 1
 *
 */
public class ReverseInt {
    public static int reverseInt(int value) {
        int startPt = Math.abs(value);
        StringBuilder builder = new StringBuilder();

        while (startPt > 0){
            builder.append(startPt%10);
            startPt/= 10;
        }
        int result = Integer.parseInt(builder.toString());
        if (value < 0){
            return 0 - result;
        }else{
            return result;
        }
    }
}
