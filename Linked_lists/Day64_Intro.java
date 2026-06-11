
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

public class Day64_Intro {

    private static Node convertArray2LL( int[] arr ){

        Node head = new Node(arr[0]);
        Node mover = head;

        for( int i = 1; i<arr.length; i++ ){
            Node temp = new Node(arr[i]);

            mover.next = temp; // both are same
            mover = temp;
        }
        return head;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40};

        Node head = convertArray2LL(arr);
        System.out.println(head.data);

        

    }
}
