import java.util.ArrayList;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        ArrayList<Character>list = new ArrayList<>();
        int len = s.length(), len2 = t.length();
        for (int i = 0; i < len; i++) {
            list.add(s.charAt(i));
        }

        Character ch;
        for (int i = 0; i < len2; i++) {
            ch = t.charAt(i);
            if (list.contains(ch)){
                list.remove(ch);
            }
            else
                return false;
        }

        return true;
    }
}

/*
    Better solution: (WHY DIDN'T I THINK OF THAT)

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);

  */