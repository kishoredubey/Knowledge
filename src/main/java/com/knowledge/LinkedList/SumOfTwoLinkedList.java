package com.knowledge.LinkedList;

public class SumOfTwoLinkedList {
    public static void main(String[] args) {
        Node first = new Node(4);
        first.next = new Node(5);

        Node second = new Node(3);
        second.next = new Node(4);
        second.next.next = new Node(5);
        printList(addTwoLists(first, second));
    }
    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static Node addTwoLists(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);

        int quo = 0;
        Node result = null, temp = null;
        while (first != null && second != null) {
            int sum = first.data + second.data + quo;
            int rem = sum % 10;
            quo = sum / 10;

            if (temp == null) {
                result = new Node(rem);
                temp = result;
            } else {
                temp.next = new Node(rem);
                temp = temp.next;
            }

            first = first.next;
            second = second.next;
        }
        while (first != null) {
            int sum = first.data + quo;
            int rem = sum % 10;
            quo = sum / 10;

            if (temp == null) {
                result = new Node(rem);
                temp = result;
            } else {
                temp.next = new Node(rem);
                temp = temp.next;
            }
            first = first.next;
        }
        while (second != null) {
            int sum = second.data + quo;
            int rem = sum % 10;
            quo = sum / 10;

            if (temp == null) {
                result = new Node(rem);
                temp = result;
            } else {
                temp.next = new Node(rem);
                temp = temp.next;
            }
            second = second.next;
        }
        if(quo != 0) {
            temp.next = new Node(quo);
        }

        return reverse(result);
    }

    static Node reverse(Node node) {
        Node prev = null, next = null, current = node;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
