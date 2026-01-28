class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resault = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int value = Math.abs(nums[i]);
            if(nums[value - 1] < 0){
                resault.add(value);
            }

            nums[value - 1] *= -1;
        }

        return resault;
    }
}

//[4,3,2,7,8,2,3,1]