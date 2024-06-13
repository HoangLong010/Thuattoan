public class palindrome {
    public static boolean isPalindrome(int x){
        String original = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(original).reverse();
        return original.equals(reversed.toString());
    }
    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;
        System.out.println(isPalindrome(x1));
        System.out.println(isPalindrome(x2));
        System.out.println(isPalindrome(x3));

    }
    
}
