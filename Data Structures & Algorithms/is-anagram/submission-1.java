class Solution {
    public boolean isAnagram(String s, String t) {
        // put string in hashmap, letter - key, count -values
        //if letter not found - not anagram
        //if we met all letters in second word. its fine return true
if(s.length() != t.length()){
    return false;
}
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i< s.length(); i++){
           char c =  s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c,1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for(int i = 0; i<t.length(); i++){
            char c = t.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }
        return true;
    }
}
