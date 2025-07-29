package finalexam;

import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        TreeNode root = buildTree(vals);
        printLeftView(root);
    }

    // 建立二元樹（層序，有 -1 表示 null）
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

    // BFS 輸出每層最左邊的節點
    static void printLeftView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        System.out.print("LeftView:");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == 0) System.out.print(" " + node.val); // 每層第一個
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }
    }
}

