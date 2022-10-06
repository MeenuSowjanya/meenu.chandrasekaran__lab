package com.Meenu;

import java.util.Arrays;

public class Array {
  
	
    public static void main(String[] args) {
		duplicates();
		sortArray();
		addElement(12,3);
	}
    
    // duplicates
    public static void duplicates() {
    	int[] list= {1,2,3,4,3,12,5,4};
    	int length=0;
    	int count=1;
    	for(int index:list) {
    		length+=1;
    	}
    	for(int i=0;i<length;i++) {
    		for(int j=(i+1);j<length;j++) {
    			if(list[i]==list[j]) {
    				System.out.println("Duplicate value "+count+" : "+list[i]);
    				count+=1;
    			}
    		}
    	}
    }
    
    // Sorting array
    public static void sortArray() {
    	int[] arr ={78, 34, 1, 3, 90, 34, -1, -4}; 
    	System.out.print("The Reversed Array is : [");
    	for (int i = 0; i < arr.length; i++) {  
    	  for (int j = i + 1; j < arr.length; j++) {  
    	    int temp = 0;  
    	    if (arr[i] > arr[j]){  
    	     temp = arr[i];  
    	     arr[i] = arr[j];  
    	     arr[j] = temp;  
    	   }  
    	}    
    	if(i!=(arr.length-1)) {
    		System.out.print(arr[i]+",");	
    	}
    	else {
    		System.out.print(arr[i]);
    	}
    }
    	System.out.print("]");
   }
    
   // Inserting an element in the specified index in an array
   public static void addElement(int element,int index) {
	   int[] array= {1,5,7,19};
	   int[] newArray=new int[5];
	   for(int i=0;i<index;i++) {
		   newArray[i]=array[i];
	   }
	   newArray[index]=element;
	   for(int j=(index);j<array.length;j++) {
		   newArray[j+1]=array[j];
	   }
	   array=newArray;
	   System.out.println("\n"+Arrays.toString(array));
   }
}
