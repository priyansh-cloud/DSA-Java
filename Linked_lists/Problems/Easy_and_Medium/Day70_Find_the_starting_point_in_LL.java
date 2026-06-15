import java.util.HashMap;

public class Day70_Find_the_starting_point_in_LL {
    

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
    public static  Node hasCycle(Node head) {
        
        // edge 
        if( head == null || head.next == null ) return null;
        HashMap <Node, Integer> map = new HashMap<>();

        Node temp = head;
        while( temp != null ){

            if( map.containsKey(temp) == true ) return temp;
            map.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }

    //!                     Optimal [ slow & fast pointer ]

    public static  Node hasCycle1(Node head) {
        
        // edge 
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            
            if( slow == fast ){ // 1st collision point
                slow = head;
                while( slow != fast ){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

        }
        return null;
    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);

        Node loop = hasCycle(head);
        // System.out.println(loop + " : given list does'nt have a cyclic loop ");

        Node cycle = hasCycle(head);
        System.out.println(cycle + " : given list does'nt have a cyclic loop ");
        

    }

    
}
