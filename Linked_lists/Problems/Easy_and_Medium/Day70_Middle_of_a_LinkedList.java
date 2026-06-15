
class Node{

        int data;
        Node next;

        Node( int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node( int data1 ){
            this.data = data1;
            this.next = null;
        }
    }

public class Day70_Middle_of_a_LinkedList {
    
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

    // Function to reverse the DLL using stack
    public static  Node Middle_Node(Node head) {
        
        
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }


    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2DLL(arr);

        Node middle = Middle_Node(head);
        System.out.println(middle.data);

        

    }

}
