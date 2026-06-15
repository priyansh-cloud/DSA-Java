
public class Day69_reverse {
    
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

            // Move prev forward
            prev = temp;
        }
        return head;
    }

    // Function to reverse the DLL using stack
    public static  Node reverse(Node head) {
        
        Node temp = head;
        Node prev = null;

        while( temp != null ){

            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;

    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        head = reverse(head);

        print(head);

    }

}
