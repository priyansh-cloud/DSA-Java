public class Day58_Reverse_Words_in_a_String {
    

    public static String reverseWords(String s) {
        
        String[] words = s.trim().split("\\s+"); // \\s+ means one or more whitespace characters, so multiple spaces are treated as a single separator.

        int left = 0;
        int right = words.length - 1;

        while ( left < right ){

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words); // Join back into a string
    }

    public static void main(String[] args) {
        
        String s = "a good   example";
        String ans = reverseWords(s);

        System.out.println(ans);
    }
}
