import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i=m, j=0;
        while (i<nums1.length && j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
    }
}
