class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long ans[] = new long[n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], new ArrayList<>()));
            map.get(nums[i]).add(i);
        }
          for (ArrayList<Integer> list : map.values()) {

            long totalSum = 0;

            // Total sum of all indices
            for (int index : list) {
                totalSum += index;
            }

            long leftSum = 0;

            for (int j = 0; j < list.size(); j++) {

                int index = list.get(j);

                long rightSum = totalSum - leftSum - index;
                long rightCount = list.size() - j - 1;

                long leftCount = j;

                long leftDistance = (long) index * leftCount - leftSum;
                long rightDistance = rightSum - (long) index * rightCount;

                ans[index] = leftDistance + rightDistance;

                leftSum += index;
            }
        }

        return ans;
    }
}