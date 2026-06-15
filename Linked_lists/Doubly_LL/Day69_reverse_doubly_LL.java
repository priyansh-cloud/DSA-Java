public class Day69_reverse_doubly_LL {
    
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

    public static Node reverse( Node head ){

        Node current = head;
        Node last = null;

        // edge cases
        if( head == null || head.next == null ) return head;

        while( current != null ){

            // old prev becomes new next
            // old next becomes new prev
            
            last = current.prev;
            current.prev = current.next;
            current.next = last;

            current = current.prev;

        }

        return last.prev;

    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        head = reverse(head);

        print(head);

    }


}
