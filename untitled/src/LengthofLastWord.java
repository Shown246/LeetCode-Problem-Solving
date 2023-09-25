public class LengthofLastWord {
    public int lengthOfLastWord(String s){
        String[] arr = s.split(" ");
        int len = arr.length;
        return arr[len-1].length();
    }
}

/*
Another solution:
  	int count = 0;
        for(int i=s.length() - 1 ; i>=0 ; i--) {
            if(s.charAt(i) == ' ' && count == 0) {
                count = 0;
            }
            else if(s.charAt(i) == ' ' && count != 0) {
                break;
            }
            else {
                count++;
            }
        }
        return count;
*/

