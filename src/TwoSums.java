import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to find two numbers in a list that add up to a target value.
 *
 * [1, 3, 5]  4
 * 1  -> 4 - 1 = 3
 */

public class TwoSums {
    public static List<Integer> twoSum(List<Integer> ints, int target) {
        List<Integer> result = new ArrayList<>();
        for(int num : ints){
           if(ints.contains(target - num)){
               result.add(num);
               result.add(target - num);
               break;
           }
        }
        return result;
    }
}