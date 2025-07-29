package finalexam;

import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static int diameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        TreeNode root = buildTree(vals);
        dfs(root);
        System.out.println("Diameter: " + diameter);
    }

    // 建立樹（層序輸入，有 -1 表 null）
    static TreeNode buildTree(String[] vals) {
        if (vals.length == 0 || vals[0].equals("-1")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < vals.length) {
            TreeNode curr = queue.poll();
            if (!vals[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.offer(curr.left);
            }
            i++;
            if (i < vals.length && !vals[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    // 後序走訪計算高度，同時更新直徑
    static int dfs(TreeNode node) {
        if (node == null) return 0;
        int lh = dfs(node.left);
        int rh = dfs(node.right);
        diameter = Math.max(diameter, lh + rh); // 經過當前節點的最長路徑（邊數）
        return Math.max(lh, rh) + 1; // 回傳高度
    }
}

