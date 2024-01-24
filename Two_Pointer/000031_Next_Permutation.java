class Solution {
    public void nextPermutation(int[] nums) {
        
        int low = nums.length-2;
//from right to left, search for the first one which is smaller than the right digit.
        while(low >= 0 && nums[low] >= nums[low+1]){
            low--;
        }

//If the one exists, search a one which is larger than it from right to left.
        if(low >= 0){

            int high = nums.length-1;

            while(high >= 0 && nums[low] >= nums[high]){
                high--;
            }

          //swap them.
            swap(nums, low, high);
        }

//flip the right to make the number smaller.
        reverse(nums, low+1);

    }

    public void swap(int[] nums, int low, int high){

        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
     public void reverse(int[] nums, int low){
       
       int left = low;
       int right = nums.length-1;

       while(left < right){

           int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        left++;
        right--;

       }
    }
}
