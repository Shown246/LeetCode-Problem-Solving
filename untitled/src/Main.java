import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int m = in.nextInt();
        in.nextLine();
        String str2 = in.nextLine();
        int n = in.nextInt();
        str = str.substring(1, str.length()-1);
        str2 = str2.substring(1, str2.length()-1);
        String[] arr = str.split(",");
        String[] arr2 = str2.split(",");
        int[] nums1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            nums1[i] = Integer.parseInt(arr[i]);
        }
        int[] nums2 = new int[arr.length];
        for(int i = 0; i < arr2.length; i++){
            nums2[i] = Integer.parseInt(arr2[i]);
        }
        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1,m,nums2,n);
        int k = nums1.length;
        for (int i = 0; i < k; i++) {
            System.out.print(nums1[i]);
            if (i != k - 1) {
                System.out.print(",");
            }
        }
    }
}