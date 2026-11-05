class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> cCounts= new HashMap<>();

        int left=0;
        int maxFrequency=0;
        int maxLength=0;

        for(int high=0; high< s.length(); high++)
        {
            char rightChar=s.charAt(high);
            cCounts.put(rightChar, cCounts.getOrDefault(rightChar, 0) + 1);
            maxFrequency = Math.max(maxFrequency, cCounts.get(rightChar));

            while((high - left + 1) - maxFrequency > k){
             char leftChar= s.charAt(left);
            
                cCounts.put(leftChar, cCounts.get(leftChar)-1);
                left++;
            }


            maxLength = Math.max(maxLength, high - left + 1);

        }

    return maxLength;

    }
}