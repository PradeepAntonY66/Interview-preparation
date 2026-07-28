/* Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome. */

public class Panlindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        System.out.println(str);

        String result = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result);
        int l = 0, r = result.length()-1;

        while (l < r) {
            if (result.charAt(l) != result.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
