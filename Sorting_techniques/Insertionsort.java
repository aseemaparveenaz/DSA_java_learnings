import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  static void insert(int arr[],int k)
  {
       // Your code here
       for(int i=0;i<k-1;i++) // or i<n-1
      {
          for(int j=i+1;j>0;j--)//j starts with the next element ofi
          {
              if(arr[j]<arr[j-1])
              {
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                 arr[j-1]=temp;
              }
              else
                      break;
          }
          
      }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      insert(arr,n);
  }
}
