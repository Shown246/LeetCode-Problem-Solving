public class IsSubsequence {
    public boolean isSubsequence(String s, String t){
        int len = t.length(), j=0, i = 0;
        if(s.isEmpty())
            return true;

        while ((i<len) && (j<s.length())){
            if (s.charAt(j) == t.charAt(i)){
                j++;
            }
            i++;
        }

        return  (j==s.length());
    }
}
