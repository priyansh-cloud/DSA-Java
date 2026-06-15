
import java.util.HashMap;

public class Day70_Detect_a_loop_in_LL {
    
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

    //!                     Brute [ Hashing ]
    // Function to reverse the DLL using stack
    public static  boolean hasCycle(Node head) {
        
        // edge 
        if( head == null || head.next == null ) return false;
        HashMap <Node, Integer> map = new HashMap<>();

        Node temp = head;
        while( temp != null ){

            if( map.containsKey(temp) == true ) return true;
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    //!                     Optimal [ slow & fast pointer ]

    public static  boolean hasCycle1(Node head) {
        
        // edge 
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast ) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);

        Boolean loop = hasCycle(head);
        // System.out.println(loop + " : given list does'nt have a cyclic loop ");

        Boolean cycle = hasCycle(head);
        System.out.println(cycle + " : given list does'nt have a cyclic loop ");
        

    }

}
