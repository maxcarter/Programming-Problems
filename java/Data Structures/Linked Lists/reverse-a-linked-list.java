/*
    URL: https://www.hackerrank.com/challenges/reverse-a-linked-list
    
    Problem: 
    You’re given the pointer to the head node of a linked list. Change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning that the initial list is empty.

    Sample input:
    NULL 
    2 --> 3 --> NULL

    Sample output:
    NULL
    3 --> 2 --> NULL
*/
/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission.
// You only need to complete this method.
Node Reverse(Node head) {
    if (head == null) {
        return null;
    }
    Node reverse = null;
    Node node = head;
    while (node != null) {
        Node temp = reverse;
        reverse = new Node();
        reverse.data = node.data;
        reverse.next = temp;
        node = node.next;
    }
    return reverse;
}
