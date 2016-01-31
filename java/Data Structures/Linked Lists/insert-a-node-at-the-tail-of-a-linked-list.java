/*
    URL: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
    
    Problem: 
    You have to complete the Node* Insert(Node* head, int data) method. It takes two arguments: the head of the linked list and the integer to insert.

    Insert the new node at the tail and just return the head of the updated linked list. Do not print anything to stdout/console.

    Sample input:
    NULL, data = 2 
    2 --> NULL, data = 3

    Sample output:
    2 -->NULL
    2 --> 3 --> NULL
*/

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    Node node = head;
    while(node.next != null) {
        node = node.next;
    }
    node.next = new Node();
    node.next.data = data;
    return head;
}
