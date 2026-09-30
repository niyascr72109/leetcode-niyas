// Last updated: 9/30/2026, 9:41:04 AM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4
5        int min = Integer.MAX_VALUE;
6
7        for (int i = 0; i < arr.length - 1; i++) {
8            min = Math.min(min, arr[i + 1] - arr[i]);
9        }
10
11        List<List<Integer>> res = new ArrayList<>();
12
13        for (int i = 0; i < arr.length - 1; i++) {
14            if (arr[i + 1] - arr[i] == min) {
15                res.add(Arrays.asList(arr[i], arr[i + 1]));
16            }
17        }
18
19        return res;
20    }
21}