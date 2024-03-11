package leetCode._0206_Reverse_Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        while(head != null) {
            ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        int[] expectedOutput1 = {5, 4, 3, 2, 1};
        ListNode reversedList1 = s.reverseList(head1);
        if (test(reversedList1, expectedOutput1)) {
            System.out.println("1번 테스트 케이스 통과");
        } else {
            System.out.println("1번 테스트 케이스 실패");
        }

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        int[] expectedOutput2 = {2, 1};
        ListNode reversedList2 = s.reverseList(head2);
        if (test(reversedList2, expectedOutput2)) {
            System.out.println("2번 테스트 케이스 통과");
        } else {
            System.out.println("2번 테스트 케이스 실패");
        }

        ListNode head3 = null;
        int[] expectedOutput3 = {};
        ListNode reversedList3 = s.reverseList(head3);
        if (test(reversedList3, expectedOutput3)) {
            System.out.println("3번 테스트 케이스 통과");
        } else {
            System.out.println("3번 테스트 케이스 실패");
        }

    }

    public static boolean test(ListNode reversedList, int[] expectedOutput) {
        ListNode current = reversedList;
        int i = 0;
        while (current != null && i < expectedOutput.length) {
            if (current.val != expectedOutput[i])
                return false;
            current = current.next;
            i++;
        }
        return current == null && i == expectedOutput.length;
    }

}
