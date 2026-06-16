
import java.util.Stack;

public class Day71_Palindrome_Linked_List {
    

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

    //!                     Brute [ HashMap ]
    public static  boolean isPalindrome_brute(Node head) {

        Stack < Integer > st = new Stack<>();
        Node temp = head;

        while( temp != null ){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while( temp != null ){

            if( temp.data != st.pop() ){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    //!                         Optimal [ Slow and Fast pointer ]
    public static  Node reverse(Node head){

        if( head == null || head.next == null ) return head;
        Node curr = head;
        Node prev = null;

        while( curr != null ){
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

     public static  boolean isPalindrome_Optimal(Node head) {

        Stack < Integer > st = new Stack<>();
        Node temp = head;

        while( temp != null ){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while( temp != null ){

            if( temp.data != st.pop() ){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 20, 10};

        Node head = convertArray2DLL(arr);

        boolean palindrome = isPalindrome_Optimal(head);
        System.out.println(palindrome);

        

    }

}
