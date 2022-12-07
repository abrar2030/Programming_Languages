import java.util.HashMap;
import java.util.Map;
public class mainStat {
    public static void main(String[] args){
        letterStat ls = new letterStat();
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        String word = "Helloworld";
        h = ls.getStat(word);
        for (Map.Entry<Character, Integer> entry: h.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")"); //r(1)d(1)e(1)w(1)H(1)l(3)o(2)
    }

    }
    
}
