class listNode {
    int val;
    listNode next;

    public listNode (int val) {
        this.val = val;
        next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.println("\nReversed Linked List:");
        printLinkedList(head);
    }

    public static void printLinkedList(listNode head) {
        listNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    public static listNode reverseLinkedList(listNode head) {
        listNode prev = null;
        listNode current = head;
        while (current != null) {
            listNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}