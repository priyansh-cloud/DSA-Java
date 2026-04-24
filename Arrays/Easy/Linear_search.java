public class Linear_search {
    public static void main(String[] args) {
        int arr[] = {2,5,8,3,6};
        int num = 6;
        boolean found = false;

        for(int i =0; i<arr.length; i++){
            if(arr[i] == num) {
            System.out.println(i);
            found = true;
            }
        }
        if( !found ){
            System.out.println("not");
        }
        
    }
}
