/*
    URL: https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
    
    Problem: 
    You have to complete the Node* Insert(Node* head, int data) method which takes two arguments - the head of the linked list and the integer to insert. 

    Insert the new node at the head and return the head of the updated linked list. Do NOT print anything to stdout/console.

    Sample input:
    NULL , data = 1 
    1 --> NULL , data = 2

    Sample output:
    1 --> NULL
    2 --> 1 --> NULL
*/

/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node node = new Node();
    node.next = head;
    node.data = x;
    return node;
}