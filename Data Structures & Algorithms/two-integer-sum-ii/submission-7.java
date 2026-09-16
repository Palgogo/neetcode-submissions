class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int left = i + 1;
            int right = numbers.length - 1;
            int tmp = target - numbers[i];
            while(left <= right){
                int mid = left + (right - left) / 2;
                
                if(numbers[mid] == tmp){
                    return new int[] {i +1, mid + 1};
                }
                if(numbers[mid] < tmp){
                    left = mid + 1;
                }
                if (numbers[mid] > tmp){
                    right = mid - 1;
                }
                
            }
        }

        return new int[0];
    }
}
