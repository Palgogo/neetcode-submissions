class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        
        for(int i = 0,j=i+1; i<nums.length -1; i++){
            if (nums[i] == nums[j]) {
                return true;
            }
            j++;
        }
        return false;
    }
}