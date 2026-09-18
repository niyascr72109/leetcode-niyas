// Last updated: 9/18/2026, 10:38:50 PM
1class Solution {
2    static boolean isVowel(char ch) {
3        return ch == 'A' || ch == 'a' ||
4               ch == 'E' || ch == 'e' ||
5               ch == 'I' || ch == 'i' ||
6               ch == 'O' || ch == 'o' ||
7               ch == 'U' || ch == 'u';
8    }
9
10    public String reverseVowels(String s) {
11        char[] ch = s.toCharArray();
12        int l = 0;
13        int r = s.length() - 1;
14        while (l < r) {
15            if (!isVowel(ch[l])) {
16                l++;
17            }
18            else if (!isVowel(ch[r])) {
19                r--;
20            }
21            else {
22                char temp = ch[l];
23                ch[l] = ch[r];
24                ch[r] = temp;
25
26                l++;
27                r--;
28            }
29        }
30        String str = new String(ch);
31        return str;
32    }
33}