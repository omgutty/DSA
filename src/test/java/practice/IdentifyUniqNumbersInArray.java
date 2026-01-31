package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.testng.annotations.Test;

public class IdentifyUniqNumbersInArray {
	
	
	
	//this test will remove the duplicates 
	
	//by using hash set
	//create one hash set and pass one by one complete array
	//hash set will not allow duplicate, 
	//create a list and store in that list, which are uniq inside the for loop 
	
	@Test
	public void removeduplicates() {
		int arr[]= {1,2,3,4,5,1,2};
		
		System.out.println("Unique numbers: ");
		
		Set<Integer> read= new HashSet<>();
		List<Integer> uniq= new ArrayList<>();
		
		for (int num: arr) {
			if (read.add(num)) {
				uniq.add(num);
			}
		}
		System.out.println(uniq);
		}
	
	
	//identify the non duplicate numbers in the array 
	
	//byusing hashset 
	
	@Test 
	public void identifyduplicatenumbersusinghashset() {
		
		int number[]= {1,2,3,4,5,1,2,3};
		
		//taking two set hash sets 
		
		Set<Integer> all= new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for(int num: number) {
			//passing numbers into all set, if not able to add into all set. consider it is duplicate, 
			//becuase set will not allow duplicate
			//it will go inside the if condition and add duplicates into duplicate set.
			
			if (!all.add(num)) {
				duplicate.add(num);
			}
		}
		
		System.out.println("Non duplicate numbers: ");
				//duplicates are we know, now remove those duplicates in all set. 
		all.removeAll(duplicate); //here, duplicates are removed from all 
		//now print all 
		System.out.println(all);
	}
	
	
	// idenify the non duplicate numbers by using maps, here we will get the out out in numbers, not in array.
	//Non-duplicate numbers (appear once)
	
	//Need to understand below program 
	//below program copied from GPT
	@Test
	public void findNonDuplicates() {  // Numbers appearing EXACTLY ONCE
	    int arr[] = {1, 2, 3, 4, 5, 1, 2};
	    
	    Map<Integer, Integer> frequency = new HashMap<>();
	    
	    // Count frequency first
	    for(int num : arr) {
	        frequency.put(num, frequency.getOrDefault(num, 0) + 1);
	    }
	    
	    // Print only numbers with frequency == 1
	    System.out.println("Non-duplicate numbers (appear once):");
	    for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
	        if(entry.getValue() == 1) {
	            System.out.print(entry.getKey()+" ");
	        }
	    }
	    System.out.println();
	}

	
		
	}


