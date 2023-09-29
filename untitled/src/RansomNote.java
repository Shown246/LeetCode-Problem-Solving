import java.util.ArrayList;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len =  ransomNote.length(), len2= magazine.length();
        ArrayList<Character> list = new ArrayList<>();
        for (int i=0; i<len2; i++){
            list.add(magazine.charAt(i));
        }
        Character c;
        for (int i = 0; i<len; i++){
            c = ransomNote.charAt(i);

            if(list.contains(c)){
                list.remove(c);
            }
            else
                return false;
        }


        return true;
    }
}
