public class RemoveDulpicateFromSortedArrayII {
public int removeDuplicates(int[] nums) {
        int count = 0, len = nums.length, k = 0;
        for(int x=0 ;x<2;x++){
            count = 0;
            for (int i=1; i< len; i++){
                if (nums[i] == nums[i-1]){
                    count++;
                }
                if ((count == 1) && (nums[i] != nums[i-1])) {
                    count = 0;
                }
                if (count > 1 && nums[i] == nums[i-1]){
                    // shift the array to the left
                    for (int j=i; j<len-2; j++){
                        nums[j] = nums[j+1];
                    }
                    k++;
                }

            }
        }

        return k;
    }
}
