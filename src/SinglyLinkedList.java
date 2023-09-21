class ListNode {
    int val;
    listNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);

        System.out.println("Linked List elements:");
        printLinkedList(head);
    }

    public static void printLinkedList(listNode head) {
        listNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}