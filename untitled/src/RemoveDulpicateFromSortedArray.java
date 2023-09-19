// Date: 18/09/2023
// Main method
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        str = str.substring(1, str.length()-1);
//        String[] arr = str.split(",");
//        int[] nums = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//          nums[i] = Integer.parseInt(arr[i]);
//        }
//        RemoveDulpicateFromSortedArray solution = new RemoveDulpicateFromSortedArray();
//        int k = solution.removeDuplicates(nums);
//        for (int i = 0; i < k; i++) {
//          System.out.print(nums[i]);
//          if (i != k - 1) {
//              System.out.print(",");
//          }
//        }
//Explanation:
//        The code starts iterating from i = 1 because we need to compare each element with its previous element to check for duplicates.
//
//        The main logic is inside the for loop:
//
//        If the current element nums[i] is not equal to the previous element nums[i - 1], it means we have encountered a new unique element.
//        In that case, we update nums[j] with the value of the unique element at nums[i], and then increment j by 1 to mark the next position for a new unique element.
//        By doing this, we effectively overwrite any duplicates in the array and only keep the unique elements.
//        Once the loop finishes, the value of j represents the length of the resulting array with duplicates removed.
//
//        Finally, we return j as the desired result.
public class RemoveDulpicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int i=0; i< len; i++){
            if(i==0 || nums[i] != nums[i-1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
