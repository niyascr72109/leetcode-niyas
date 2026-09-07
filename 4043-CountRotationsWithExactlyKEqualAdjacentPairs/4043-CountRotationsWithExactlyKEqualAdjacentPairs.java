// Last updated: 9/7/2026, 2:53:43 PM
1class Solution {
2    public int countRotations(String s, int k) {
3        int n = s.length();
4        int c=0;
5        for(int i=0;i<=n-1;i++)
6        {
7            if(s.charAt(i) == s.charAt((i+1)%n)) //circular array.
8            {
9                c++; //equal only 1
10            }
11        }
12        int x = n-c;  //unequal 3-1 = 2;
13
14        
15        if(k == c-1)    return c;  //given == equal-1    equal;
16        if(k == c)  return x;   //given == equal  => unequal
17
18        return 0;
19        
20    }
21}