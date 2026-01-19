class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int max = 0;
        if(n < 3){return 0;}

        int left;
        int right;

        for(int i = 1; i < n - 1; i++){
            if(arr[i - 1] < arr[i] && arr[i + 1] < arr[i] ){
                left = i;
                right = i;

            while(left > 0 && arr[left - 1] < arr[left]){
                left--;
            }    
            while(right < n - 1 && arr[right + 1] < arr[right]){
                right++;
            }
            max = Math.max(max, right - left + 1);
            }
        }
    return max;
    }
}

//[2,1,4,7,3,2,5]