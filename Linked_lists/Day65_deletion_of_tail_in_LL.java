public class Day65_deletion_of_tail_in_LL {
    
    // Creates a Linked List from an array
    private static Node TraversalInLL( int[] arr ){

        // First element becomes the head node
        Node head = new Node(arr[0]);
        Node mover = head;

        // Create remaining nodes
        for( int i = 1; i<arr.length; i++ ){

            // Create a new node
            Node temp = new Node(arr[i]);

            // Connect current node to new node
            mover.next = temp; // both are same
            mover = temp;
        }
        return head;
    }

    // Prints all nodes of the Linked List
    private static void print( Node head ){


        // Traverse until we reach null
        while( head != null ){

           System.out.println(head.data);

           // Move to next node
           head = head.next;
            
        }

        
    }

    // Deletes the tail (last node) of the Linked List
    public static Node DeletionOfTail( Node head ){

        // If list is empty or contains only one node,
        // deleting the tail makes the list empty
        if( head == null || head.next == null ){
            return null;
        }

        // Start traversal from head
        Node temp = head;

        // Move temp until it reaches the second-last node
        // Example:
        // 10 -> 20 -> 30 -> 40 -> null
        // temp stops at 30
        while( temp.next.next != null ){
            temp = temp.next;
        }

        // Remove the last node by making
        // second-last node point to null
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        // Create Linked List
        Node head = TraversalInLL(arr);

        // Delete last node
        head = DeletionOfTail(head);

        print(head);

    }
}
