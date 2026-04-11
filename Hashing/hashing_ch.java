public class hashing_ch {
    public static void main(String[] args) {
        
        // array or string 
        char arr[] = {'a','b','c','b','d','e'};

        // hash array
        int hash[]= new int[26];

        // precompute
        for(int i =0; i<arr.length; i++){
            hash[arr[i]-'a']++;
            // System.out.println(hash[arr[i]-'a']);
        }

        // q query
        char q[] = {'a','b'};
        for(int i=0; i<q.length; i++){
           System.out.println(hash[q[i]-'a']);
        }
        
        
    }
}
