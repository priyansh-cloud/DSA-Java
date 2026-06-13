public class Day67_delete_tail {
    

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

    public static Node deleteTail( Node head ){

        // edge cases
        if( head == null || head.next == null ) return null;

        Node tail = head;

        while( tail.next != null ){
            
            tail = tail.next;
            
        }

        Node prev = tail.prev;
        prev.next = null;                                                                        
        tail.prev = null;                                                                     

        return head;

    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        head = deleteTail(head);

        print(head);

    }


}
