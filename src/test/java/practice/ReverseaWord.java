package practice;

import org.testng.annotations.Test;

public class ReverseaWord {
	
	//Q: Reverse a String 
	//“I can reverse a string using built-in methods for efficiency, loops for clarity, and two pointers for algorithmic optimization.”
	
	//reverse a word with String builder
	//“StringBuilder provides a built-in reverse method which is optimized and mutable, so it is more efficient than string concatenation.”
	@Test
	public void reversethewordwithStringbuilder() {
		
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
	public void reversethestringwithLoops() {
		String word= "Tanmayi is beautiful";
		String revesedword= "";
		
		for (int i= word.length()-1;i>=0;i--) {
			revesedword= revesedword+word.charAt(i);
		}
		
		System.out.println(revesedword);
	}
	
	//reverse a word with characters one pointer at start , one pointer at end
	//here we convert the string to char
	// two int initiated one as left the place is 0
	// one as right, initiated with lenthg of the string minus 1
	
	//writing a condition while left int  is less than right 
	//continue untill the middle point of the string, 
	//create one temp char and assign the left char which is first charater on the string 
	//get the last char which is char of right - right value is 6, total workds are 7, but in char array it is 0-6
	//right value assigned to left 
	//temp value which is stored in temp is assigned to right. 
	
	//we continue this till firt pointer moved to center.
	//left pointer also moved to center. 
	//where left<right is false loop exit.
	// we need to increse the left number on by one, right number we need to decease 
	//at last print the chars value 
	
	@Test
	public void revesretheStringwithpointer() {
		String word="Tanmayi";
		char[] chars= word.toCharArray(); //word we have converted into char array. 
		System.out.println(chars);
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
