public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0){
            return prefix;
        }
        int minLen = strs[0].length();
        for(int i=1; i<strs.length; i++){
            if(strs[i].length() < minLen){
                minLen = strs[i].length();
            }
        }
        for(int i=0; i<minLen; i++){
            char c = strs[0].charAt(i);
            for(int j = 0; j< strs.length; j++) {
                if(strs[j].charAt(i) == c && j == strs.length - 1){
                    prefix += c;
                }
                else if(strs[j].charAt(i) != c){
                    return prefix;
                }
            }
        }

        return prefix;
    }
}

//Better solution
//    Arrays.sort(strs);
//            String s1 = strs[0];
//            String s2 = strs[strs.length-1];
//            int idx = 0;
//            while(idx < s1.length() && idx < s2.length()){
//              if(s1.charAt(idx) == s2.charAt(idx)){
//                  idx++;
//              } else {
//                  break;
//              }
//            }
//        return s1.substring(0, idx);
