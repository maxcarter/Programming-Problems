/*
    URL: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
    
    Problem: 
    You have to complete the Node* Delete(Node* head, int position) method which takes two arguments - the head of the linked list and the position of the node to delete.
    Delete the node at the given position and return the head of the updated linked list. Do NOT print anything to stdout/console.

    Sample input:
    1 --> 2 --> 3 --> NULL, position = 0 
    1 --> NULL , position = 0

    Sample output:
    2 --> 3 --> NULL
    NULL
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
// This is a "method-only" submission.
// You only need to complete this method.

Node Delete(Node head, int position) {
    // Complete this method
    Node node = head;
    if (position == 0) {
        head = node.next;
    } else {
        for (int i = 1; i < position; i++) {
            node = node.next;
        }
        node.next = node.next.next;
    }
    return head;
}