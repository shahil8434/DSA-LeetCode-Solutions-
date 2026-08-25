class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int i = 1;
        while(i <= nums.length + 1 ){
            int ele = i * k;
            if(!set.contains(ele)){
                return ele;  
            }
            i++;
        }
        return -1;
    }
}