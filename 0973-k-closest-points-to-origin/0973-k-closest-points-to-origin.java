class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
        int [][] result = new int[k][];
        for(int i = 0; i < k; i++){
            result[i] = points[i];
        }
        return result;
    }
}