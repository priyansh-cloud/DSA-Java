// Node of a Doubly Linked List
class Node {

    // Stores the data
   int data;

   // Points to the next node
   Node next;

   // Points to the previous node
   Node prev;

   // Constructor to initialize all fields
   Node(int var1, Node var2, Node var3) {
      this.data = var1;
      this.next = var2;
      this.prev = var3;
   }

   // Constructor to create a single node
   Node(int var1) {

      this.data = var1;

      // Initially no next node
      this.next = null;

      // Initially no previous node
      this.prev = null;
   }
}

public class Day66_array_to_doubly_LL {

    private static void print( Node head ){

        // Traverse until we reach the end of the list
        while( head != null ){

            // Print current node's data
           System.out.println(head.data);

           // Move to next node
           head = head.next;
            
        }
        
    }

    private static Node convertArray2DLL( int[] arr ){

        // Create head node using first element
        Node head = new Node(arr[0]);

        // Pointer used for traversal
        Node prev = head;

        for( int i = 1; i<arr.length; i++ ){

            // Create new node
            Node temp = new Node(arr[i]);

            // Link previous node to current node
            prev.next = temp; 
            
            // Link current node back to previous node
            temp.prev = prev;

            // Move prev forward
            prev = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        print(head);

    }
}
