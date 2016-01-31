/*
    URL: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
    
    Problem: 
    You have to complete the Node* Insert(Node* head, int data, int position) method which takes three arguments - the head of the linked list, the integer to insert and the position at which the integer must be inserted. 
    Insert the new node at the desired position and return the head of the updated linked list. Do NOT print anything to stdout/console.

    Sample input:
    NULL, data = 3, position = 0 
    3 --> NULL, data = 4, position = 0

    Sample output:
    3 --> NULL
    4 --> 3 --> NULL
*/

/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
Node InsertNth(Node head, int data, int position) {
    // This is a "method-only" submission.
    // You only need to complete this method.
    Node node = head;
    if (position == 0 ) {
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        return temp;
    } else {
        position--;
        while (position > 0) {
            node = node.next;
            position--;
        }
        Node temp = new Node();
        temp.data = data;
        temp.next = node.next;
        node.next = temp;

        return head;
    }

}