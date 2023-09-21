class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    public DoublyListNode(int val) {
        this.val = val;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyListNode head = new DoublyListNode(1);
        DoublyListNode second = new DoublyListNode(2);
        DoublyListNode third = new DoublyListNode(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Doubly Linked List elements:");
        printDoublyLinkedList(head);
    }

    public static void printDoublyLinkedList(DoublyListNode head) {
        DoublyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}