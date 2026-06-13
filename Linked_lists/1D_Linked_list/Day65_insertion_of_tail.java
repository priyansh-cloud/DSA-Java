public class Day65_insertion_of_tail {
    

    private static Node TraversalInLL( int[] arr ){

        
        Node head = new Node(arr[0]);

        Node mover = head;

        // Start from index 1 because arr[0] is already used for head
        for( int i = 1; i<arr.length; i++ ){

            // Create a new node for the current array element
            Node temp = new Node(arr[i]);

            
            mover.next = temp; // both are same
            mover = temp;
        }
        return head;
    }

    public static Node InsertTail( Node head, int val ){

        // If the list is empty, the new node becomes the head
        if( head == null ){ // edge case
            return new Node(val);
        }

        // Start traversal from the head
        Node temp = head;
        
        while ( temp.next != null ){
            temp = temp.next; // last element

        }
        // Create a new node with the given value
        Node newNode = new Node(val);

        // Attach the new node at the end
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        // Create the Linked List and get its head
        Node head = TraversalInLL(arr);

        head = InsertTail(head, 100);

        
        Node temp = head;

        // Traverse until temp becomes null
        while( temp != null ){

            // Print the data of the current node
            System.out.println(temp.data);

            // Move to the next node
            temp = temp.next;
        }

    }


}
