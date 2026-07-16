class Solution {
    public boolean hasDuplicate(int[] nums) {
       // Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        if(set.size() < nums.length){
            return true;
        }

        return false;
    }
}