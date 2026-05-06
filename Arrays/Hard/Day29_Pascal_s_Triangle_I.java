
import java.util.ArrayList;
import java.util.List;


public class Day29_Pascal_s_Triangle_I {
    public static void main(String[] args) {

        List<Integer> ans = new ArrayList<>();
        int n = 5;
        int res = 1;
        ans.add(res);

        for(int i = 0; i<n; i++){
            res = res*(n-i)/(i+1);
            ans.add(res);
        }
        
        System.out.println(ans);





    //     int n = 5;
        
    //     for(int i = 0; i<n; i++){

    //         int res = 1;
    //     for(int j = 0; j<= i; j++){

    //         System.out.print(res + " ");
    //         res = res*(i-j)/(j+1);
            
    //     }
    //     System.out.println();
    // }
        
        

        
    }
}
