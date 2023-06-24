//coding ninjas
/* -1 2 3 4 -3 1 here no of pos!=neg so remaining elements either in pos or neg should be kept at last.
*/


import java.util.ArrayList;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        int n=a.length;
        int[] ans=new int[n];
        int posI=0,negI=1,newindex=0;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]>0) 
                   pos.add(a[i]);
             else 
                   neg.add(a[i]);
        }
        if(pos.size()>neg.size())
        {
           for(int i=0;i<neg.size();i++) //keep eye on small quantity
           {
               ans[2*i]=pos.get(i);
               ans[2*i+1]=neg.get(i);
           }
           newindex=ans.length;
           for(int i=neg.size();i<pos.size();i++)
           {
                ans[newindex++]=pos.get(i);
           }
        }
        else{
           for(int i=0;i<pos.size();i++) //keep eye on small quantity
           {
               ans[2*i]=pos.get(i);
               ans[2*i+1]=neg.get(i);
           }
           newindex=ans.length;
           for(int i=pos.size();i<neg.size();i++)
           {
                ans[newindex++]=neg.get(i);
           }
        }
        return ans;
    }
}

//sc, tc -->o(n)
