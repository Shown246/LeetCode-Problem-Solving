import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len =  ransomNote.length(), len2= magazine.length();
        HashMap<Integer,String> map = new HashMap<>();
        int j=0;
        for (int i=0; i<len2; i+=len){
            String string;
            string = magazine.substring(i,i+len);
            map.put(j,string);
            j++;
        }
        System.out.println(map);

        return true;
    }
}
