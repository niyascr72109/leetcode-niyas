// Last updated: 9/29/2026, 10:32:14 AM
1class Solution {
2    static boolean palindrome(String s1){
3        String s2=new StringBuilder(s1).reverse().toString();
4        if(s1.equals(s2))
5        return true;
6        else return false;
7    }
8    public int countSubstrings(String s) {
9        // int l = 0;
10        // int r = 0;
11        // int c=1;
12        // while(l<r){
13        //     String t="";
14        //     char[] ch=t.toCharArray();
15        //     char c=s.charAt(l);
16        //     if(palindrome(c)){
17        //         t+=c;
18        //         r++;
19        //     }
20        //     else{
21                
22        //     }
23        int c = 0;
24        for(int i=0;i<s.length();i++){
25            String str = "";
26            for(int j=i;j<s.length();j++){
27                str+=s.charAt(j);
28                if(palindrome(str)) c++; 
29            }
30        }
31        return c;
32        }
33    }
34