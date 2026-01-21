class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefics = new int[nums.length + 2];

        for(int i = 0; i < nums.length; i++){
            prefics[i + 1] = prefics[i] + nums[i];
        }

        int answer = -1;  
        
        for(int i = 1; i < prefics.length - 1; i++){
            if(prefics[i - 1] == prefics[prefics.length - 2] - prefics[i] ){
                answer = i - 1;
                return answer;
            }
        }
        return answer;
    }
}