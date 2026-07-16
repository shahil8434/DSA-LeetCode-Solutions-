class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        int window = 0;
        int max = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (grumpy[right] == 1) {
                window += customers[right];
            }
            if ((right - left + 1) > minutes) {
                if (grumpy[left] == 1) {
                    window -= customers[left];
                }
                left++;
            }
            max = Math.max(window, max);
        }
        return max + sum;
    }
}