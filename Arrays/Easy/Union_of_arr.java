//Union is adding 2 array without repetition
//using set
/*Time Compleixty : O( (m+n)log(m+n) ) 
Space Complexity : O(m+n) */
class solution{
static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
  HashSet <Integer> s=new HashSet<>();
  ArrayList < Integer > Union=new ArrayList<>();
  for (int i = 0; i < n; i++)
    s.add(arr1[i]);
  for (int i = 0; i < m; i++)
    s.add(arr2[i]);
  for (int it: s)
    Union.add(it);
  return Union;
}
public static void main(String args[]) {
  int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 is ");
  for (int val: Union)
    System.out.print(val+" ");
}
}
//using map
/*Time Compleixty : O( (m+n)log(m+n) ) 
Space Complexity : O(m+n) */
static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
  HashMap <Integer,Integer > freq=new HashMap<>();
  ArrayList<Integer> Union=new ArrayList<>();
  for (int i = 0; i < n; i++)
    freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
    
  for (int i = 0; i < m; i++)
    freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
  for (int it: freq.keySet())
    Union.add(it);
  return Union;
}
