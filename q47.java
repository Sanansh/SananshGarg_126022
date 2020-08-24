import java.io.*; 
import java.util.*;
class Q47 { 

	static void CountingEvenOdd(int arr[], int arr_size) 
	{ 
		int even_count = 0;		 
		int odd_count = 0;		 
			

		for(int i = 0 ; i < arr_size ; i++) 
		{ 

			if ((arr[i] & 1) == 1) 
				odd_count ++ ;	 
			else				
				even_count ++ ;	 
		} 
	
		System.out.println( "Number of even"
			+ " elements = " + even_count 
			+ " Number of odd elements = "	+ odd_count) ;	 
	} 
	

	public static void main (String[] args) 
	{ 
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the Number of Numbers you want ");
        int j=jj.nextInt();

        int arr[] = new int [j];
        for(int i=1;i<=5;i++)
        {
            arr[i]=jj.nextInt();
        }
		int n = arr.length; 
        CountingEvenOdd(arr, n); 
        jj.close();
	} 
}