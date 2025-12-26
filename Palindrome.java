/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		if (s.length()==0||s.length()==1){
			return true;
		}
		return helper(s,0, s.length()-1);
    }

	public static boolean helper (String s, int first, int last){
		if (s.length()==0||s.length()==1){
			return true;
		}
		if (s.charAt(first) == s.charAt(last)){
			return helper(s.substring(first+1, last-1), first, last);
		}
		return false;
	}
}