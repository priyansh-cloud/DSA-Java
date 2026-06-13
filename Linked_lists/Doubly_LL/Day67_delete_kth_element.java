public class Day67_delete_kth_element {
    
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

    // Head
    public static Node deleteHead( Node head ){

        // edge cases
        if( head == null || head.next == null ) return null;

        Node prev = head;
        
        head = head.next;
        head.prev = null;
        prev.next = null;

        return head;

    }

    // Tail
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

    public static Node DeleteK( Node head, int k ){

        // 1st reach at kth position
        int count = 0;
        Node temp = head;

        while( temp != null ){

            count++;

            if( count == k ) break;
            temp = temp.next;
        }

        if( temp == null ) return head;   // k is invalid

        // edge cases
        Node prev = temp.prev;
        Node front = temp.next; 

        // single element
        if( prev == null && front == null ){ // prev = null && front = null => Single element
            return null;
        }

        // k == 1 => k is head
        else if( prev == null ){
            return deleteHead(head);
        }

        // k == last elment => k is tail
        else if( front == null ){
            return deleteTail(head);
        }

        // if k is in between anywhere
        prev.next = front;
        front.prev = prev;

        temp.prev = null;
        temp.next = null;


        return head;

    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        head = DeleteK(head, 2);

        print(head);

    }

}
