class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length - 1;
        int sum = skill[i] + skill[j];
        long total = 0;
        while(i < j){
            int k = skill[i] + skill[j];
            if(k != sum){
                return -1;
            }
            long product = skill[i] * skill[j];
            total+= product;
            i++;
            j--;
        }
        return total;
    }
}