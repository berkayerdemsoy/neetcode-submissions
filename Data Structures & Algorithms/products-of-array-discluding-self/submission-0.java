class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            int carpim = 1;
            for(int j = 0;j<nums.length;j++){
                if(i == j){
                    continue;
                }
                carpim = carpim * nums[j];
            }
           result[i] = carpim;
            
        }  
        return result;
    }
}  
