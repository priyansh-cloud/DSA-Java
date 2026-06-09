public class Day59_Isomorphic_Strings {
    

    public static  boolean isIsomorphic(String s, String t) {
        
         int[] m1 = new int[256], m2 = new int[256];

         int n = s.length();
  
          // Loop through all characters in the strings
          for (int i = 0; i < n; ++i) {
              // Return false if mapping is inconsistent
              if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
  
              // Update last seen index for both characters
              m1[s.charAt(i)] = i + 1;
              m2[t.charAt(i)] = i + 1;
          }

        return true;
    }


    public static void main(String[] args) {
        
        String s = "egg", t = "add";
        boolean ans = isIsomorphic(s , t);

        System.out.println(ans);

    }
}
