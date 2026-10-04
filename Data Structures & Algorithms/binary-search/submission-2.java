class Solution {
    public int search(int[] nums, int target) {
    
        int l=0;
        int r=nums.length-1;
        while(l<r || l==r){
            if(nums[l]==target){
                return l;
            }else if(nums[r]==target){
                return r;
            }else if(nums[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return -1;
    }
}
