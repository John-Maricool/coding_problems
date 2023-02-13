import java.util.ArrayList;
import java.util.List;

/**
 * write a java code that
 * checks if the sequence of brackets in a given string is balanced or not.
 *
 * ()
 * (()
 * (   [   ]   )
 *
 */
public class CheckSequence {
    public static boolean performCheck(String swq) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < swq.length()){
            String res = checkBracket(swq.substring(i, i+1));
            if(!list.isEmpty() && list.get(list.size() - 1).equals(res)){
                list.remove(list.size() -1);
            }else{
                list.add(swq.substring(i, i+1));
            }
            i++;
        }
        return list.isEmpty();
    }

    public static String checkBracket(String bracket){
        return switch (bracket) {
            case ")" -> "(";
            case "(" -> ")";
            case "[" -> "]";
            case "]" -> "[";
            case "{" -> "}";
            case "}" -> "{";
            default -> "";
        };
    }
}
