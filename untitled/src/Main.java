import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
//        str = str.substring(1, str.length()-1);
//        String[] arr = str.split(",");
//        int[] nums = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            nums[i] = Integer.parseInt(arr[i]);
//        }
        LengthofLastWord solution = new LengthofLastWord();
        int k = solution.lengthOfLastWord(str);
        System.out.println(k);
//        for (int i = 0; i < k; i++) {
//            System.out.print(nums[i]);
//            if (i != k - 1) {
//                System.out.print(",");
//            }
//        }
    }
}