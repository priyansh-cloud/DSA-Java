
import java.util.HashMap;

public class Day71_Length_of_loop_in_LL {
    

    private static void print( Node head ){

        // Traverse until we reach the end of the list
        while( head != null ){

            // Print current node's data
           System.out.println(head.data);

           // Move to next node
           head = head.next;
            
        }
        
    }

    private static Node convertArray2DLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        // Create loop: last node points to 3rd node
        Node temp = head;
        Node third = null;
        Node last = null;

        int pos = 1;

        while (temp != null) {

            if (pos == 3)
                third = temp;

            if (temp.next == null)
                last = temp;

            temp = temp.next;
            pos++;
        }

        last.next = third;   // Creates loop

        return head;
    }

    //!                     Brute [ Hashing ]
    public static int findLengthOfLoop(Node head) {

            // edge 
        if( head == null || head.next == null ) return 0;

        HashMap <Node, Integer> map = new HashMap<>();
        int count = 0;

        Node temp = head;
        while( temp != null ){
            

            if( map.containsKey(temp) ) {
               int firstVisitedAt  = map.get(temp);
                return  count - firstVisitedAt ;
            }
            map.put(temp, count);
            count++;
            temp = temp.next;
        }
        return 0;
     }


    //!                     Optimal [ slow & fast pointer ]
     public static  int find_Length_Of_Loop(Node head) {

            // edge 
        if( head == null || head.next == null ) return 0;

        Node slow = head;
        Node fast = head;

        int count = 1;

        Node temp = head;
        while( fast != null && fast.next != null ){
            
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast ){
                fast = fast.next;
                while( slow != fast ){
                    
                    count++;
                    fast = fast.next;

                }
                return count;
            }
            
        }
        return 0;
    
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);

        // int length = findLengthOfLoop(head);
        // System.out.println("Loop Length = " + length);

        int length = find_Length_Of_Loop(head);
        System.out.println("Loop Length = " + length);
        

    }


}
