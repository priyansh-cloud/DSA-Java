
import java.util.ArrayList;
import java.util.List;

public class Day22_rearrange_elements_by_sign {
    public static void main(String[] args) {

        //                VARIETY 1 ( equal no of +ve's and -ve's )

        ArrayList< Integer > A = new ArrayList<>();
        int[] a = {1, 2, -4, -5};

        // Brute : TC -> O(2N)  &&  SC -> O(N)

        // List<Integer> positive = new ArrayList<>();
        // List<Integer> negative = new ArrayList<>();

    //    for(int i = 0; i<a.length; i++){
    //     if(a[i] > 0 ){
    //         positive.add(a[i]);

    //     }
    //     else{
    //         negative.add(a[i]);
    //     }
    //    }

    //    for(int i = 0; i<a.length/2; i++){
    //     a[i*2] = positive.get(i);
    //     a[i*2+1] = negative.get(i);
    //    }

    //     for(int i = 0; i<a.length; i++){
    //         System.out.println(a[i]);
    //     }


    // ------------------->  Optimal : TC -> O(N)  &&  SC -> O(N)
    // int posIndex = 0;
    // int negIndex = 1;
    // int ans[] = new int[a.length];

    // for(int i = 0; i<a.length; i++){
    //     if(a[i] < 0){
    //         ans[negIndex] = a[i];
    //         negIndex += 2;
    //     }
    //     else{
    //         ans[posIndex] = a[i];
    //         posIndex += 2;
    //     }
    // }
    // for(int i = 0; i<a.length; i++){
    //         System.out.println(ans[i]);
    //     }


 //                VARIETY 2 ( unequal no of +ve's and -ve's )

        ArrayList< Integer > B = new ArrayList<>();
        int[] b = {1, 2, -4, -5, 4, 1};

        List<Integer> posIndx = new ArrayList<>();
        List<Integer> negIndx = new ArrayList<>();

        for(int i = 0; i<b.length; i++){

            if( b[i] > 0 ){
                posIndx.add(b[i]);
            }
            else{
                // negative
                negIndx.add(b[i]);
            }
        }

        if(posIndx.size() > negIndx.size() ){

            for(int i = 0; i<negIndx.size(); i++ ){
            b[i*2] = posIndx.get(i);
            b[i*2+1] = negIndx.get(i);

        }
         int index = negIndx.size() * 2;
            for(int i = negIndx.size(); i< posIndx.size(); i++ ){
                b[index] =  posIndx.get(i); ;
                index++;
            }
        }
        else{
            // negative
             for(int i = 0; i<posIndx.size(); i++ ){
            b[i*2] = posIndx.get(i);
            b[i*2+1] = negIndx.get(i);

        }

         int index = posIndx.size() * 2;
            for(int i = posIndx.size(); i< negIndx.size(); i++ ){
                b[index] =  negIndx.get(i);
                index++;
            }
        }
           
        


        // arrange 
        // for(int i = 0; i<b.length/2; i++ ){
        //     b[i*2] = posIndx.get(i);
        //     b[i*2+1] = negIndx.get(i);

        // }

        // print array
            for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }




        
    }
}
