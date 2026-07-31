import java.util.Arrays;

public class AnagramChecker {
    
    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        

        if (str1.length() != str2.length()) {
            return false;
        }
        

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
    
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String test1 = "Tea";
        String test2 = "Eat";

        if (isAnagram(test1, test2)) {
            System.out.println(test1 + " and " + test2 + " are anagrams.");
        } else {
            System.out.println(test1 + " and " + test2 + " are NOT anagrams.");
        }
    }
}
