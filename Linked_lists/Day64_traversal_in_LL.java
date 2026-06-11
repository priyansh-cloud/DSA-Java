public class Day64_traversal_in_LL {
    

    // Converts an array into a Linked List
    private static Node TraversalInLL( int[] arr ){

        // Create the first node using the first element
        // This node becomes the head of the Linked List
        Node head = new Node(arr[0]);

        // mover is used to keep track of the last node
        // Initially, both head and mover point to the same node
        Node mover = head;

        // Start from index 1 because arr[0] is already used for head
        for( int i = 1; i<arr.length; i++ ){

            // Create a new node for the current array element
            Node temp = new Node(arr[i]);

            // Connect the last node (mover) to the new node
            // Move mover to the newly created node
            // So mover always points to the last node
            mover.next = temp; // both are same
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        // Create the Linked List and get its head
        Node head = TraversalInLL(arr);

        // temp is used for traversal
        // Start traversal from the head
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
