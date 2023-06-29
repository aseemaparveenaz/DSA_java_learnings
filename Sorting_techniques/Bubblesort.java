
class Solution
{//o(n^2) is the both worst and best as well as avg
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        //it omits the starting elements
        int minIndex=i;
        for(int j=i;j<=arr.length-1;j++)
        {
            if(arr[j]<arr[minIndex])
            {
                minIndex=j;
            }
        }
        return minIndex;
	}
	
	void selectionSort(int arr[], int n)
	{
	  for(int i=0;i<=n-2;i++)/*bcz last element will be already sorted 
	  no need to iterate on that and then ex: for 6 leents 5 steps taken*/
	  {
	      int min=select(arr,i);
	      int temp=arr[i];
	      arr[i]=arr[min];
	      arr[min]=temp;
	  }
	}
}
