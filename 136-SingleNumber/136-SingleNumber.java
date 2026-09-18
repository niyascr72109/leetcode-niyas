// Last updated: 9/18/2026, 10:20:09 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        HashMap<Character,Integer> h = new HashMap<>();
4        for(char ch : ransomNote.toCharArray()){
5            h.put(ch,h.getOrDefault(ch,0)+1);
6        }
7        for(char ch : magazine.toCharArray()){
8            if(h.containsKey(ch)){
9                h.put(ch,h.get(ch)-1);
10                if(h.get(ch) == 0){
11                    h.remove(ch);
12                }
13            }
14        }
15        return h.isEmpty();
16    }
17}