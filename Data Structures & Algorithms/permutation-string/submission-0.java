class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int left = 0;
        int[] s1Counts = new int[26];
        int[] windowCounts = new int[26];

        //fill the window and s1
        for(int i = 0; i < s1.length(); i++){
            s1Counts[s1.charAt(i) - 'a']++;
            windowCounts[s2.charAt(i) - 'a']++;
        }

        //check initial window
        if(matches(s1Counts, windowCounts)) return true;

        //go through the s2
        //remove the left, add the right, check mathces
        int right = s2.length();

        for(int i = s1.length(); i<s2.length(); i++){
            windowCounts[s2.charAt(i - s1.length()) - 'a']--;
            windowCounts[s2.charAt(i) -'a']++;
             if(matches(s1Counts, windowCounts)) return true;
        }
        return false;
    }

    boolean matches(int[] a, int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
