package DSAProblemStatement;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str)); // Output: true
    }

    public static boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        // Check if the string reads the same forwards and backwards
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
