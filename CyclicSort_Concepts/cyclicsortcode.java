import java.util.Arrays;
class HelloWorld {
    static void cyclicsort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int current=arr[i]-1;// since range from 1
            if(arr[i]!=arr[current]) //check with the value that has taken as the index
            {
                  //swaps
                int temp=arr[i];
                arr[i]=arr[current];
                arr[current]=temp;
            }
            else
             i++;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
//output--->[1, 2, 3, 4, 5]
