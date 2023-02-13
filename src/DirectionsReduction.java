import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a function dirReduc which will take an array of strings
 * and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
 *
 *
 * Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible.
 * "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and
 * can't become such.
 * Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
 *
 */

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        Map<String, String> theMap = new HashMap();
        theMap.put("SOUTH", "NORTH");
        theMap.put("NORTH", "SOUTH");
        theMap.put("EAST", "WEST");
        theMap.put("WEST", "EAST");

        List<String> list = new ArrayList();

        for(String singleVal : arr){
            if(!list.isEmpty() && list.get(list.size() - 1).equals(theMap.get(singleVal))){
                list.remove(list.size() - 1);
            }
            else{
                list.add(singleVal);
            }
        }
        return list.toArray(new String[0]);
    }
}
