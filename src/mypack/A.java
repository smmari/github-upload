package mypack;

//Arrays example 

public class A {
	 public static void main(String a[])
	    {    
	        int[] myArray  = {6,8,2,3};    
	        System.out.println("Before Insertion Sort");  	        
	        printArray(myArray);	            
	        insertionSort(myArray);//sorting array using insertion sort    	           
	        System.out.println("After Insertion Sort");  	        
	        printArray(myArray);   
	    }    
	 public static void insertionSort(int arr[]) 
		{  
	        int n = arr.length;  	        
	        for (int i = 1; i < n; i++)
	        {   System.out.println("Sort Pass Number "+(i));
	            int numb = arr[i];  
	            int arrItemPosition = i-1;  	            
	            while ( (arrItemPosition > -1) && ( arr [arrItemPosition] > numb ) ) 
	            {  
	            System.out.println("Comparing "+ numb  + " and " + arr [arrItemPosition]); 
	                arr [arrItemPosition+1] = arr [arrItemPosition];  
	                arrItemPosition--;  
	            }  
	            arr[arrItemPosition+1] = numb; 
	            System.out.println("Swapping Elements: New Array After Swap");
	            printArray(arr);
	        }  
	    }
	 static void printArray(int[] array){
		    
		    for(int i=0; i < array.length; i++)
			{  
				System.out.print(array[i] + " ");  
			} 
		    System.out.println();
		    
		}
}