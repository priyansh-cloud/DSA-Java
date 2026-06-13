public class Day65_deletion_of_position {
    

    // Creates a Linked List from an array
    private static Node TraversalInLL( int[] arr ){

        // First element becomes the head node
        Node head = new Node(arr[0]);
        Node mover = head;

        // Create remaining nodes
        for( int i = 1; i<arr.length; i++ ){
            Node temp = new Node(arr[i]);

            // Connect current node to new node
            mover.next = temp; // both are same
            mover = temp;
        }
        return head;
    }

    // Prints all nodes of the Linked List
    private static void print( Node head ){


        // Traverse until end of list
        while( head != null ){

           System.out.println(head.data);

           // Move to next node
           head = head.next;
            
        }

        
    }

    // Deletes the first node (head node)
    public static Node DeletionOfHead( Node head ){

        // If list is empty, nothing to delete
        if( head == null ){
            return head;
        }
        // Store current head temporarily
        Node temp = head;

        // Move head to second node
        head = head.next;

        // Old head is automatically removed
        // because no reference points to it anymore

        return head;
    }

    public static Node removeK( Node head, int k ){

        // edge cases
        if( head == null ) return null; // Empty list

        if ( k <= 0 ) return head; //  Invalid position

        if( k == 1 ){   // Delete head
            return DeletionOfHead(head);
        }

        int count = 1;
        Node temp = head;

        while( count < k-1 ){
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
        
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        // Create Linked List
        Node head = TraversalInLL(arr);

        // Delete first node
        head = removeK(head, 0);

        print(head);

    }
}
