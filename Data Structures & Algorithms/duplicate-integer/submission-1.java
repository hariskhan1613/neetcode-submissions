class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int num:nums){
            if(hash.contains(num)){
                return true;
            }
            hash.add(num);
        }
        return false;
    }
}