class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,zeros=0,maxlen=0;
        int len=0;
        while(r < nums.length){
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
            if(zeros <= k){
                len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        return maxlen;
    }
}