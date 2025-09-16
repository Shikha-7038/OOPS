public class PalindromeChecker {
    String text;

    void setDetails(String t){
        text = t;
    }
    boolean isPalindrome(){
        int left = 0;
        int right = text.length()-1;

        while(left<=right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void displayResult(){
        if(isPalindrome()){
            System.out.println(text+" is a Palindrome");
        }else{
            System.out.println(text +" is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        PalindromeChecker p2 = new PalindromeChecker();

        p1.setDetails("madam");
        p2.setDetails("hello");

        p1.displayResult();
        p2.displayResult();

    }
}
