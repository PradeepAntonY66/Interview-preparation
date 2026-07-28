// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

class ReverseString{
    public static void main(String[] args) {
         char[] s = {'h','e','l','l','o'};
         reverseString(s);
    }

    public static void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int left = 0 , right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] =temp;
            right--;
            left++;
        }
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}