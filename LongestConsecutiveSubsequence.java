// Leetcode 128
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int ele : nums)
            set.add(ele);
        
        int len = 0;
        for(int ele : nums){
            if(!set.contains(ele))
                continue;
                        
            int left = ele - 1, right = ele + 1;
            
            set.remove(ele);
            
            while(set.contains(left))
                set.remove(left--);
            
            while(set.contains(right))
                set.remove(right++);
            
            if(right - left - 1 > len)
                len = right - left - 1;
        }
        
        return len;
    }
}
