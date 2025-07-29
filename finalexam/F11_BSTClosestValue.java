package finalexam;

import java.util.*;

public class F11_BSTClosestValue {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        TreeNode root = buildTree(vals);
        int target = sc.nextInt();
        System.out.println("Closest: " + findClosest(root, target));
    }

    // 建立 BST
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

    // 一邊走一邊找最接近的值
    static int findClosest(TreeNode node, int target) {
        int closest = node.val;
        while (node != null) {
            int diff = Math.abs(node.val - target);
            int closestDiff = Math.abs(closest - target);
            if (diff < closestDiff || (diff == closestDiff && node.val < closest))
                closest = node.val;
            node = (target < node.val) ? node.left : node.right;
        }
        return closest;
    }
}
