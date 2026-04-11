public class hashing {
    
    public static void main(String[] args) {
        
        // array
        int arr[] = {1,2,3,2,1,5};

        // hash array
        int hash[] = new int[7];

        // precompute
        for(int i =0; i<arr.length; i++){
            hash[arr[i]] += 1;
        }

        // queries
        int q[] = {1,2,3};
        for(int i =0; i<q.length; i++){
            int num = q[i];
            System.out.println(hash[num]);
        }

    }
}
