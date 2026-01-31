package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Reverse_order_of_words {
	
	//Q: Reverse order of words
	// input: one two three
	// output: three two one
	
	//using String builder
	@Test
	public void reverseorderofwordswithstringbuilder() {
		String sentence="Tanmayi is beautiful";
		String words[]= sentence.split(" ");
		StringBuilder sb= new StringBuilder();
		
		for (int i = words.length-1; i>=0;i--) {
			sb.append(words[i]);
			if(i > 0) sb.append(" "); //add empty space except last  
		}
		System.out.println(sb.toString());
	}
	
	/*
	 * String split with space and added words array created string builder, in for
	 * loop last word pick first as i is lenght-1 appended the string build with
	 * last word. after that , in this case i=2 so append the space beautiful and
	 * space next loop i=1 so append the space beautifull space is space next loop
	 * i=0 so at last no space will be added.
	 */
	
	//by using collections. 
	
	@Test
	public void reverseorderofwordswithcollection() {
		String sentence="Tanmayi is beautiful";
		String words[]= sentence.split(" ");
		List<String> wordlist= Arrays.asList(words);
		Collections.reverse(wordlist); 
		
		//System.out.println(String.join(" ", wordlist));
		
		//instead of above line calling String class and join with list of arrays ,
		//intilize strig builder and pass one by one ,word and append space . 
		
		StringBuilder sb = new StringBuilder();
		for(String word : wordlist) {
		    sb.append(word).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	
	
	
	
	
	
	

}
