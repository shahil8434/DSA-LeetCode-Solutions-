class Solution {
    public boolean check(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        for (int num : nums) {
            list.add(num);
        }
        while (!check(list)) {

            int minSum = Integer.MAX_VALUE;
            int minIdx = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    minIdx = i;
                }
            }

            list.remove(minIdx + 1);
            list.set(minIdx, minSum);
            count++;
        }
        return count;
    }
}