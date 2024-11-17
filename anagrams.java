import java.util.*;

public class anagrams
{
    public static void main(String[] args) {
        String str1 = "Integer";
        String str2 = "Integer";

        if (str1.length() != str2.length()) {
            System.out.println("Two Strings are not anagrams");
        } else {
            
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Two Strings are anagrams");
            } else {
                System.out.println("Two Strings are not anagrams");
            }
        }
    }
}

