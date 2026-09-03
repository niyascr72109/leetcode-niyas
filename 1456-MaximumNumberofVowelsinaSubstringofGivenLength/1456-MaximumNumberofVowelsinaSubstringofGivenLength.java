// Last updated: 9/3/2026, 12:03:33 PM
1class Solution {
2    public int countKConstraintSubstrings(String s, int k) {
3        int co=0;
4        int l=0;
5        HashMap<Character,Integer> m=new HashMap<>();
6        for(int i=0;i<s.length();i++){
7            char c=s.charAt(i);
8            if(m.containsKey(c))
9            m.put(c,m.get(c)+1);
10            else
11            m.put(c,1);
12            while(m.getOrDefault('0',0) >k && m.getOrDefault('1',0) > k){
13                char le=s.charAt(l);
14                m.put(le,m.get(le)-1);
15                if(m.get(le)=='0'){
16                    m.remove(le);
17                }
18                l++;
19            }
20            co+=i-l+1;
21        }
22        return co;
23    }
24}