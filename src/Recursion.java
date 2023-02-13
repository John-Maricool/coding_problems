/**
 * Write a function that prints a number and reduces it by 1 continue printing till its 0
 */

public class Recursion {

    static void printNumberFrom(int value){
        if(value >= 0){
            System.out.println(value);
            printNumberFrom(--value);
        }
    }

    static void printNumberFromWithoutRecursion(int value){
        while(value >= 0){
            System.out.println(value);
            value--;
        }
    }
}
