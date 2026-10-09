class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int m = horizontalCuts.length;
        int n = verticalCuts.length;
        int hmax = horizontalCuts[0] - 0;
        int vmax = verticalCuts[0] - 0;

        for(int i = 0; i < m - 1; i++){
            hmax = Math.max(hmax, horizontalCuts[i + 1] - horizontalCuts[i]);
        }
        hmax = Math.max(hmax, h - horizontalCuts[m - 1]);

        for(int i = 0; i < n - 1; i++){
            vmax = Math.max(vmax, verticalCuts[i + 1] - verticalCuts[i]);
        }
         vmax = Math.max(vmax, w - verticalCuts[n - 1]);

        return (int) ((long) hmax * vmax % 1000000007);
    }
}