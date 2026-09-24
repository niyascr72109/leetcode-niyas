// Last updated: 9/24/2026, 11:13:22 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        int l=0;
4        int r=0;
5        HashMap<Character,Integer> mpp=new HashMap<>();
6        int cnt=0;
7        int sindex=-1;
8        int minlen=Integer.MAX_VALUE;
9
10        for(int i=0;i<t.length();i++){
11            mpp.put(t.charAt(i), mpp.getOrDefault(t.charAt(i), 0) + 1);
12        }
13        while(r<s.length()){
14            char ch=s.charAt(r);
15            if(mpp.containsKey(ch) && mpp.get(ch)>0){   
16                cnt++;
17            }
18            mpp.put(ch,mpp.getOrDefault(ch,0)-1);            
19            while(cnt==t.length()){
20                if(r-l+1<minlen){
21                    minlen=r-l+1;
22                    sindex=l;
23                }
24                mpp.put(s.charAt(l),mpp.get(s.charAt(l))+1);
25                if(mpp.get(s.charAt(l))>0){
26                    cnt--;
27                }
28                l++;
29                }
30            r++;
31        }
32        return sindex==-1?"":s.substring(sindex,sindex+minlen);
33    }
34}