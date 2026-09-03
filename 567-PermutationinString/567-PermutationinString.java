// Last updated: 9/3/2026, 3:29:37 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length() > s2.length()) return false;
4        HashMap<Character,Integer> h1 = new HashMap<>();
5        HashMap<Character,Integer> h2 = new HashMap<>();
6        int k = s1.length();
7        for(int i=0;i<k;i++){
8            h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)+1);
9            h2.put(s2.charAt(i),h2.getOrDefault(s2.charAt(i),0)+1);
10        }
11        if(h1.equals(h2)) return true;
12
13        for(int i=k;i<s2.length();i++){
14            h2.put(s2.charAt(i),h2.getOrDefault(s2.charAt(i),0)+1);
15            h2.put(s2.charAt(i-k),h2.getOrDefault(s2.charAt(i-k),0)-1);
16            if(h2.get(s2.charAt(i-k))==0){
17                h2.remove(s2.charAt(i-k));
18            }
19            if(h1.equals(h2)) return true;
20        }
21        return false;
22    }
23}