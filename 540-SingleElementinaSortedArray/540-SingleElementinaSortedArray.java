// Last updated: 9/8/2026, 10:32:35 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16import java.util.*;
17
18class Solution {
19
20    class NodeInfo {
21        int val;
22        int row;
23        int col;
24
25        NodeInfo(int val, int row, int col) {
26            this.val = val;
27            this.row = row;
28            this.col = col;
29        }
30    }
31
32    List<NodeInfo> list = new ArrayList<>();
33
34    public List<List<Integer>> verticalTraversal(TreeNode root) {
35
36        dfs(root, 0, 0);
37
38        Collections.sort(list, (a, b) -> {
39
40            // First sort by column
41            if (a.col != b.col) {
42                return a.col - b.col;
43            }
44
45            // Same column -> sort by row
46            if (a.row != b.row) {
47                return a.row - b.row;
48            }
49
50            // Same row and column -> sort by value
51            return a.val - b.val;
52        });
53
54        List<List<Integer>> result = new ArrayList<>();
55
56        int previousCol = Integer.MIN_VALUE;
57
58        for (NodeInfo node : list) {
59
60            if (node.col != previousCol) {
61                result.add(new ArrayList<>());
62                previousCol = node.col;
63            }
64
65            result.get(result.size() - 1).add(node.val);
66        }
67
68        return result;
69    }
70
71    private void dfs(TreeNode root, int row, int col) {
72
73        if (root == null) {
74            return;
75        }
76
77        list.add(new NodeInfo(root.val, row, col));
78
79        dfs(root.left, row + 1, col - 1);
80        dfs(root.right, row + 1, col + 1);
81    }
82}