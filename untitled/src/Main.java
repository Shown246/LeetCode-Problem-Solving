import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();

        ValidAnagram solution = new ValidAnagram();
        boolean ans = solution.isAnagram(str,str2);
        System.out.println(ans);
//        for (int i = 0; i < k; i++) {
//            System.out.print(nums1[i]);
//            if (i != k - 1) {
//                System.out.print(",");
//            }
//        }
    }
}