public class Day64_length_of_LL {
    

    private static Node TraversalInLL( int[] arr ){

        Node head = new Node(arr[0]);
        Node mover = head;

        for( int i = 1; i<arr.length; i++ ){
            Node temp = new Node(arr[i]);

            mover.next = temp; // both are same
            mover = temp;
        }
        return head;
    }

    private static int LengthOfLL( Node head ){

        Node temp = head;
        int count = 0;

        while( temp != null ){

            // System.out.println(temp.data);
            temp = temp.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = TraversalInLL(arr);

        System.out.println(LengthOfLL(head));

        
    }
}

   
