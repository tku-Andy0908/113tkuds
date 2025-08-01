class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

public class printReverse {
    public static void printReverse(ListNode head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        printReverse(head); // 輸出：3 2 1
    }
}

