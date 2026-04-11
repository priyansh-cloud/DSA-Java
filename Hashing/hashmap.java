
public class hashmap {
    public static void main(String[] args) {
       
        // array
        int arr[] = {1,2,3,2,1,2};

        // precompute
        int hash[] = new int[7];

        int maxfreq=0;
        int minfreq= arr.length;

        int maxElement = -1;
        int minElement = -1;


        for(int i =0; i<arr.length; i++){
            hash[arr[i]] += 1;

        }

        for(int i = 0; i < arr.length; i++){
            if(hash[i] > maxfreq){
                maxfreq = hash[i];
                maxElement = i;
            }

            if(hash[i] != 0 && hash[i] < minfreq){
                minfreq = hash[i];
                minElement = i;
            }
}

        System.out.println("Max freq element: " + maxElement);
        System.out.println("Min freq element: " + minElement);

        // queries
        int q[] = {1,2,3};
        for(int i =0; i<q.length; i++){
            int num = q[i];
            System.out.println(hash[num]);
            
        }
    }
}
