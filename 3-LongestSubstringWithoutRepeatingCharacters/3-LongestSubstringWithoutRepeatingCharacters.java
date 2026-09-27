// Last updated: 9/27/2026, 12:26:23 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        HashMap<Character, String> h = new HashMap<>();
4        String words[] = s.split(" ");
5
6        if (pattern.length() != words.length) {
7            return false;
8        }
9
10        for (int i = 0; i < pattern.length(); i++) {
11            char ch = pattern.charAt(i);
12
13            if (h.containsKey(ch)) {
14                if (!h.get(ch).equals(words[i])) {
15                    return false;
16                }
17            } else {
18                if (h.containsValue(words[i])) {
19                    return false;
20                }
21                h.put(ch, words[i]);
22            }
23        }
24
25        return true;
26    }
27}