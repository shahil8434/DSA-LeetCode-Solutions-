class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int k = nums[i];
            if (map.containsKey(k)) {
                totalSum += map.get(k);
            } else {
                int count = 0;
                int sum = 0;
                for(int j = 1; j*j <= k; j++){
                if(k % j == 0){
                    sum += j;
                    count++;

                    if(j != k/j){
                        sum += k/j;
                        count++;
                    }
                  }
                }
                map.put(k, sum);
                if (count == 4) {
                    totalSum += sum;
                }else{
                    map.put(k, 0);
                }
              }
            }
        return totalSum;
    }
}