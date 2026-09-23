class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int mid = (n - 1) / 2;
        int m = arr[mid];
        int i = 0;
        int j = n - 1;
        int ans[] = new int[k];
        int l = 0;

        while(l < k){
            if(Math.abs(arr[i] - m) == Math.abs(arr[j] - m)){
                if(arr[i] > arr[j]){
                    ans[l] = arr[i];
                    i++;
                    l++;
                }else{
                    ans[l] = arr[j];
                    j--;
                    l++;
                }

            } else if(Math.abs(arr[i] - m) > Math.abs(arr[j] - m)){
                ans[l] = arr[i];
                i++;
                l++;
            }else {
                ans[l] = arr[j];
                j--;
                l++;
            }

        }
        return ans;
    }
}