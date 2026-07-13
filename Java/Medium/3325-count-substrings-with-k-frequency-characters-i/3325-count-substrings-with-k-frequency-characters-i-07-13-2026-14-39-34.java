class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int freq[] = new int[26];
        int ans = 0;
        int left = 0;
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            freq[ch - 'a']++;
            while(freq[ch - 'a'] >= k){
                ans+= n - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}