

public class palindrome_recursion{


    public static boolean f(int i, int n, int arr[]){

        if(i>=n/2){
            return true;
        }

        if(arr[i] != arr[n-i-1]){
            return false;
        }

        return f(i+1,n,arr);

    }
    public static void main(String[] args) {

        int arr[] = {2,1,1,2};
        int n = arr.length;
        boolean ans = f(0,n,arr);

        System.out.println(ans);
        
    }
}

