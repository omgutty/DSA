package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class IdentifyDuplicateNumbersInArray {
	
	//Identify Duplicate numbers in arrayusing for loops
	// creating for loop and pass first number 
	// create second for loop and pass second number , first number +1
	// inside second for loop, check with if condition
	//first number which is of first for loop, second number which is of second for loop is equal or not, 
	//if first number and second number is equal go inside the if condition and print the number 
	// to give space we added comma, if we dont want comma at last go to the second program .
	// if we not give space or comma separated, numbers will come side by side. 
	
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
	// same program at last we will get space or comma for above program, 
	// to over come this problem, 
	// first duplicate found and print the number, 
	// and then set that boolean as false, 
	// when ever second duplicate number found, before printing the second duplicate, it print the comma, 
	//because first is set as false, so it will go inside the if (!first) and print comma, 
	//and then print the number. and still consider boolean as false.
	//if no dupliate found it will not print the comma at last. 
	
	
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
	
	//find the duplicate using hashset, which is very easy.
	//hash set wil not allow duplicate, 
	//crate two has set objects. 
	//one with seen, as read. 
	//one which is store duplicates.
	//pass numbers into seen hashset using for loop. 
	// as hashsett consider these number as integers, not int. 
	//use one by one it will go to seen hash set, 
	// if seen.add number false, which means if numbre is not going to seen hash set 
	//which means it is duplicate value , so inside if condition, add that number into duplicate hash shet. 
	// at last for duplicate print the duplicate hash set 
	// this will print in [4, 5] array i want to understand how to print these as 4,5
	
	
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
	//Need to understand not sure how it works.
	@Test
	public  void findDuplicatesSort() {
		int arr[]= {1,2,3,4,5,1,2};
		Arrays.sort(arr);
	    for(int i = 1; i < arr.length; i++) {
	        if(arr[i] == arr[i-1]) {
	            System.out.println("Duplicate: " + arr[i]);
	            while(i < arr.length && arr[i] == arr[i-1]) i++; // Skip consecutive
	        }
	    }
	}
	
	
	//just practiced the same as above.
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
