public class Day65_insertion_at_kth_position {
    

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

    public static Node Insert_K( Node head, int val , int k){

         // If the list is empty, the new node becomes the head
        if( head == null ){ // edge case
            if( k == 1 ){
                return new Node(val);
            }
            else{
                return null;
            }
        }

        if( k == 1 ){
            Node temp = new Node(val, head);
            return temp;
        }

        int count = 0;
        Node temp = head;

        while( temp != null ){

            count++;

            if( count == k-1 ){

                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    
    }


    //!                                 Insert by value

    public static Node Insert_befor_value( Node head, int val , int k){

        // k -> value
         
        if( head == null ){ // edge case
            return null;
        }

        if( head.data == k ){
            Node temp = new Node(val, head);
            return temp;
        }

     
        Node temp = head;

        while( temp.next != null ){

            if( temp.next.data == k ){

                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        // Create the Linked List and get its head
        Node head = TraversalInLL(arr);

        head = Insert_befor_value(head, 100, 30);

        
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
