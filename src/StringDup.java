
/**
 * Write a program that takes in a string
 * and removes all the duplicates in the string. The program should return the modified string.
 * <p>
 * example is the input is hello the output is helo
 * if the input is missisippi the output is misp
 */


public class StringDup {

    static String removeDup(String value) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(builder.toString().indexOf(c) < 0){
                builder.append(c);
            }
        }
       return builder.toString();
    }
}