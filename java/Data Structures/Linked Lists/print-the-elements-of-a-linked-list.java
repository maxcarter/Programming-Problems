/*
    URL: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
    
    Problem: You have to complete the void Print(Node* head) method which takes one argument: the head of the linked list.

    Sample input:
    NULL  
    1->2->3->NULL

    Sample output:
    1
    2
    3
*/

/*
  Print elements of a linked list on console
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.

void Print(Node head) {
    if (head != null) {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    return;
}