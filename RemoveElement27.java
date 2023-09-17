/*
 * Intuition
The intuition behind this solution is to iterate through the array and keep track of two pointers: index and i. The index pointer represents the position where the next non-target element should be placed, while the i pointer iterates through the array elements. By overwriting the target elements with non-target elements, the solution effectively removes all occurrences of the target value from the array.

Approach
Initialize index to 0, which represents the current position for the next non-target element.
Iterate through each element of the input array using the i pointer.
For each element nums[i], check if it is equal to the target value.
If nums[i] is not equal to val, it means it is a non-target element.
Set nums[index] to nums[i] to store the non-target element at the current index position.
Increment index by 1 to move to the next position for the next non-target element.
Continue this process until all elements in the array have been processed.
Finally, return the value of index, which represents the length of the modified array.
Complexity
Time complexity:
O(n)

Space complexity:
O(1)
 */

class Solution {
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