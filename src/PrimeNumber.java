/**
 * Write a java code that checks if a number is a prime number
 */
public class PrimeNumber {

   static boolean isPrime(int value){
        int theSquareRoot = (int)Math.sqrt(value);
        if(value == 2) {
            return true;
        }
        for(int i = 2; i <= theSquareRoot + 1; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }

    static void printPrimes(int stop){
       int i = 2;
       while(i <= stop){
           if (isPrime(i)){
               System.out.println(i);
           }
           i++;
       }
    }
}
