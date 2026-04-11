public class Insertion_sort {
    public static void main(String[] args) {
        
        int a[] = {13,6,9,12,8,15,14};
        int n = a.length;
        System.out.println(n);

        for(int i =0; i<=n-1; i++){
            int j = i;
            while(j > 0 && a[j-1] > a[j]){
                // swap
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;

                j--;
                
            }
           
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
        
    }
}
