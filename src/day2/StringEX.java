package day2;

public class StringEX {
	
	public static void main(String args[]) {
		
		
		String str1 = "madam what are you doing";
		String reversed = strReverseSenetence(str1);
        String str2 = "hello morankar dada ";

       System.out.println("Reversed senetnce is : "+ reversed);
       System.out.println(strReverseSenetence(str2));
		
		
		
	}

	
//	public static boolean  isPalindrome(String str) {
//		
//		
//		
//		int left = 0;
//		int right = str.length()-1;
//		
//		while(left<right) {
//			if(str.charAt(left) != str.charAt(right)) {
//				return false;
//			}
//			
//			left++;
//			right--;
//		}
//		
//		return true;
//	}
//	
	
//	public static String strReverse(String str) {
//		
//		String rev ="";
//		for (int i=str.length()-1; i>=0; i--) {
//			
//			rev += str.charAt(i);
//			
//		}
//		return rev;
//	}
	
	
public static String strReverseSenetence(String senetence) {
		String[] words = senetence.split(" ");
		String revSentence ="";
		for (int i=words.length-1; i>=0; i--) {
			
			revSentence += words[i];
			if(i!=0) {
				revSentence += " ";
			}
			
		}
		return revSentence;
	}
	
}
