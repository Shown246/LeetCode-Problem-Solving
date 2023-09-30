import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] words = s.split(" ");

        int len = pattern.length(), len2=words.length;
        if (len!=len2)
            return false;
        for (int i=0; i<len; i++){
            char ch = pattern.charAt(i);
            if (map.containsKey(ch) && (!Objects.equals(map.get(ch), words[i])))
                return false;
            map.put(ch,words[i]);
        }
        String s1;
        for (int i=0; i<len2; i++){
            s1 = words[i];
            if(map2.containsKey(s1) && (!Objects.equals((map2.get(s1)), pattern.charAt(i))))
                    return false;
            map2.put(s1,pattern.charAt(i));
        }
        for (Map.Entry<Character,String> mp : map.entrySet()){
            if(mp.getKey() != map2.get(mp.getValue()))
                return false;
        }

        return true;
    }
}
