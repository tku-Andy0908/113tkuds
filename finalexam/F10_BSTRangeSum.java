package finalexam;

import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        TreeNode root = buildTree(vals);
        int L = sc.nextInt();
        int R = sc.nextInt();
        dfs(root, L, R);
        System.out.println("RangeSum: " + sum);
    }

    // 建立 BST（層序，有 -1）
    static TreeNode buildTree(String[] vals) {
        if (vals[0].equals("-1")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < vals.length) {
            TreeNode curr = q.poll();
            if (!vals[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(vals[i]));
                q.offer(curr.left);
            }
            i++;
            if (i < vals.length && !vals[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(vals[i]));
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    // 中序走訪 + 剪枝（只走進有可能在區間內的子樹）
    static void dfs(TreeNode node, int L, int R) {
        if (node == null) return;
        if (node.val > L) dfs(node.left, L, R);
        if (node.val >= L && node.val <= R) sum += node.val;
        if (node.val < R) dfs(node.right, L, R);
    }
}

