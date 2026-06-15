import java.util.Stack;

public class Day69_reverse_using_stack {
    

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

    // Function to reverse the DLL using stack
    public static  Node reverseDLL(Node head) {
        
        // If list is empty or has one element, return it
        if (head == null || head.next == null) {
            return head;
        }

        // Stack to store node values
        Stack<Integer> st = new Stack<>();

        // Pointer to traverse list
        Node temp = head;

        // Push all node data to stack
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        // Reset temp to head
        temp = head;

        // Replace node values from stack
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }

        // Return updated head
        return head;
    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);
        head = reverseDLL(head);

        print(head);

    }


}
