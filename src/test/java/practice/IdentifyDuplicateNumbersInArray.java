package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class IdentifyDuplicateNumbersInArray {
	
	@Test
	public void DuplicateNumbersInArray1() {
		
		int number[]= {1,2,3,4,5,1,2};
		System.out.print("Duplicate number is : ");
		for (int i =0; i <number.length;i++) {
			for (int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					System.out.print(number[i] + ",");
					break;
				}
			}
		}
		System.out.println();
	}
	
	//at last no coma added 
	@Test
	public void DuplicateNumbersInArray2() {
		
		int number[]= {1,2,3,4,5,1,2};
		System.out.print("Duplicate number is : ");
		
		boolean first= true;
		for (int i =0; i <number.length;i++) {
			for (int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					if (!first) {
						System.out.print(",");
					}
					System.out.print(number[i]);
					first= false;
					break;
				}
			}
		}
		System.out.println();
	}
	
	//By using hashed set, as it is not allowed duplicate 
	
	@Test
	public void DuplicateNumbersInArray3() {
		int number[]= {1,2,3,4,5,1,2};
		
		Set<Integer> seen= new HashSet<>();
		Set<Integer> duplicate= new HashSet<>();
		
		for(int num:number) {
			if (!seen.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("Duplicates: " + duplicate);
	}
	
	
	//By using sorting
	@Test
	public static void findDuplicatesSort() {
		int arr[]= {1,2,3,4,5,1,2};
		Arrays.sort(arr);
	    for(int i = 1; i < arr.length; i++) {
	        if(arr[i] == arr[i-1]) {
	            System.out.println("Duplicate: " + arr[i]);
	            while(i < arr.length && arr[i] == arr[i-1]) i++; // Skip consecutive
	        }
	    }
	}
	
	@Test
	public void practice() {
		int num[]= {1,1,3,4,5,5};
		
		for (int i=0; i <num.length; i ++) {
			for (int j=i+1;j<num.length;j++) {
				if (num[i]==num[j]) {
					System.out.print(num[i] +" ");
					break;
				}		
			}
		}
		System.out.println(" ");
	}
	
	
	@Test
	public void practice2() {
		int num[]= {1,1,3,4,5,5};
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate= new HashSet<Integer>();
		
		for(int number:num) {
			if (!seen.add(number)) {
				duplicate.add(number);
			}
		}
		System.out.println(duplicate);
			
	}

	
	
	
	

}
