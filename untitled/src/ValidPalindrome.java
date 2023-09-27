import java.util.Objects;

public class ValidPalindrome {
    public boolean isPalindrome(String s){

        String ss = "";
        char c;
        int len= s.length();
        for (int i=0; i<len; i++){
            c = s.charAt(i);
            if(Character.isLetter(c)){
                ss += Character.toLowerCase(c);
            }
            if (Character.isDigit(c)){
                ss += c;
            }
        }
        if (Objects.equals(ss, ""))
            return true;
        len = ss.length();


        int i=0, j=len-1;
        while ((i!=j) && (i<len)){
            if(ss.charAt(i)!=ss.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// Better Solution:
//
//             int start = 0;
//             int last = s.length() - 1;
//             while(start <= last) {
//                char currFirst = s.charAt(start);
//                char currLast = s.charAt(last);
//                  if (!Character.isLetterOrDigit(currFirst )) {
//                      start++;
//                  } else if(!Character.isLetterOrDigit(currLast)) {
//                      last--;
//                  } else {
//                      if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
//                          return false;
//                      }
//                      start++;
//                      last--;
//                  }
//                }
//              return true;
