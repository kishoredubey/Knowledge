package com.knowledge.LinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ArrageByPosition {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        rearrangeEvenOdd(head);
        System.out.println(head);
    }

    static void rearrangeEvenOdd(Node head) {
        if (head == null || head.next == null) return;
        Node odd = head, even = head.next, firstEven = head.next;

        while (true) {
            if (even.next == null) {
                break;
            }
            odd.next = even.next;
            odd = even.next;

            if (odd.next == null) {
                break;
            }
            even.next = odd.next;
            even = odd.next;
        }
        odd.next = firstEven;
    }
}
