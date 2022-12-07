import java.util.HashMap;

public class letterStat {
    private HashMap<Character, Integer>data;

    public letterStat(){
        data = new HashMap<Character, Integer>();
        
        
    }

    public HashMap<Character, Integer> getStat(String word){
        HashMap<Character, Integer> result = new HashMap<>();
       
        char[] arr = word.toCharArray();

        for (char l : arr){
            if(result.containsKey(l))
            result.put(l, result.get(l) +1);

            else result.put(l, 1);
        }

        return result;

    }

    
}
