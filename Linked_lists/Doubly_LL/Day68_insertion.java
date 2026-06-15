public class Day68_insertion {
    

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

    //!                 Insert Before Head

    public static Node InsertBeforeHead( Node head, int val ){

            Node newHead = new Node(val, head, null);
            head.prev = newHead;

            return newHead;

    }

    //!                 Insert Before Tail
    public static Node InsertBeforeTail( Node head, int val ){

        // edge case
        if( head.next == null ){ // Only one element
            return InsertBeforeHead(head, val);
        }

        Node tail = head;

        while( tail.next != null ){

            tail = tail.next;
            
        }

        Node prev = tail.prev;

        Node newNode = new Node(val, tail, prev);

        prev.next = newNode;
        tail.prev = newNode;

        return head;
    }

    //!                 Insert Before kth Position
    
    public static Node Insert_at_k( Node head, int val, int k ){

        // edge cases
        if( head == null ) return null; // empty
        if( k <= 0 ) return head; // invalid position
        if( k == 1 ) return InsertBeforeHead(head, val); // head
        

        Node temp = head;
        int count = 0;

        while( temp != null && count < k-1 ){
            count++;
            temp = temp.next;
        }

        if(temp == null) return head; // invalid k
        if( temp.next == null ) return InsertBeforeTail(head, val); // tail

        Node prev = temp.prev;
        
        Node Newnode = new Node(val, temp, prev);

        prev.next = Newnode;
        temp.prev = Newnode;

        return head;

    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        // head = InsertBeforeHead(head, 5);

        // head = InsertBeforeTail(head, 100);

        head = Insert_at_k(head, 300, 3);

        print(head);

    }

}
