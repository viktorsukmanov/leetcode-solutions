class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            if(value != 0){
                nums[index++] = value; 
            }
        }

        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
//[0,1,0,3,12] -> [1,3,12,3,12] -> [1,3,12,0,0]