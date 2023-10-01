import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //String str2 = in.nextLine();

        ValidParentheses solution = new ValidParentheses();
        boolean ans = solution.isValid(str);
        System.out.println(ans);
//        for (int i = 0; i < k; i++) {
//            System.out.print(nums1[i]);
//            if (i != k - 1) {
//                System.out.print(",");
//            }
//        }
    }
}