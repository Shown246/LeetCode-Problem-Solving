//Date: 17/09/2023
//Main method
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        str = str.substring(1, str.length()-1);
//        String[] arr = str.split(",");
//        int[] nums = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//          nums[i] = Integer.parseInt(arr[i]);
//        }
//        RemoveElement solution = new RemoveElement();
//        int val = in.nextInt();
//        int k = solution.removeElement(nums, val);
//        for (int i = 0; i < k; i++) {
//          System.out.print(nums[i]);
//          if (i != k - 1) {
//              System.out.print(",");
//          }
//        }

//Approach
//        Initialize index to 0, which represents the current position for the next non-target element.
//        Iterate through each element of the input array using the i pointer.
//        For each element nums[i], check if it is equal to the target value.
//        If nums[i] is not equal to val, it means it is a non-target element.
//        Set nums[index] to nums[i] to store the non-target element at the current index position.
//        Increment index by 1 to move to the next position for the next non-target element.
//        Continue this process until all elements in the array have been processed.
//        Finally, return the value of index, which represents the length of the modified array.
//        Complexity
//        Time complexity:
//        O(n)
//
//        Space complexity:
//        O(1)
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int len = nums.length;
        for(int i=0; i < len; i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
