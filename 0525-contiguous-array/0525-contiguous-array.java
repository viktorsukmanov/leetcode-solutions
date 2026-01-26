class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int zero = 0;
        int one = 0;
        int resault = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }else{
                one++;
            }

            int dif = zero - one;

            if(dif == 0){
                resault = Math.max(resault, i + 1);
            }

            if(!map.containsKey(dif)){
                map.put(dif, i);
            }else{
                int indx = map.get(dif);
                int len = i - indx;
                resault = Math.max(resault, len);
            }


        }
        return resault;
    }
}