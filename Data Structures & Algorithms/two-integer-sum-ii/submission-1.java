class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;
        int left = 0;
        for(int i = 0 ; i<numbers.length;i++){
            if(target<numbers[left]+numbers[right]){
                right--;
            }
            if(target>numbers[left]+numbers[right]){
                left++;
            }
            if(target==numbers[left]+numbers[right]){
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{};
    }
}
