package practice;

import org.testng.annotations.Test;

public class ReverseaWord {
	
	//Q: Reverse a String 
	//“I can reverse a string using built-in methods for efficiency, loops for clarity, and two pointers for algorithmic optimization.”
	
	//reverse a word with String builder
	//“StringBuilder provides a built-in reverse method which is optimized and mutable, so it is more efficient than string concatenation.”
	@Test
	public void reverseAword1() {
		
		String word= "Tanmayi";
		StringBuilder s= new StringBuilder(word);
		System.out.println(s.reverse().toString());
	}
	
	//reverse a word with for loop
	/*
	 * “I start iterating from the end of the string using a for loop. In each
	 * iteration, I append the current character to a new string. This effectively
	 * reverses the word. The time complexity is O(n) and space complexity is O(n).”
	 */
	@Test
	public void reverseAword2() {
		String word= "Tanmayi is beautiful";
		String revesedword= "";
		
		for (int i= word.length()-1;i>=0;i--) {
			revesedword= revesedword+word.charAt(i);
		}
		
		System.out.println(revesedword);
	}
	
	//reverse a word with characters one pointer at start , one pointer at end
	
	@Test
	public void reveseAword3() {
		String word="Tanmayi";
		char[] chars= word.toCharArray(); //word we have converted into char array. 
		
		int left=0;
		int right=chars.length-1;
		
		while (left<right) {
			char temp= chars[left];
			chars[left]=chars[right];
			chars[right]= temp;
			left++;
			right--;
		}
		System.out.println(chars);
	}
	
	
	
	
	
	
	

}
