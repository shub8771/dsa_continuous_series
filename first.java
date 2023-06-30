//first negative number in every window size of k

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class first{
    public static void main(String[] args) {
        long a[]={12, -1, -7, 8, -15, 30, 16, 28};
        // long a[]={-8, 2, 3, -6, 10};
        // int k=2;
        int n=a.length;
        int k=3;
        long arr[]=negative(a, n, k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(negative(a, n, k));
    }
    static long[]negative(long arr[],int n,int k){
        ArrayList<Long> m=new ArrayList<>();
        int i=0;
        int j=0;
        Queue<Long> y=new LinkedList<Long>();
        while(j<n)
        {
            if(arr[j]<0)
            {
                y.offer(arr[j]);
            }
            if(j-i+1<k)
            {
                j++;
            }
            else{
                if(y.isEmpty())
                {
                    m.add(0l);
                }
                else
                {
                    m.add(y.peek());
                }
                if(!y.isEmpty()){
                if(arr[i]==y.peek())
                {
                    // y.remove(y.peek());
                    y.poll();
                }
            }
                i++;
                j++;
            }
        }
        long a[]=new long[m.size()];
        for(i=0;i<m.size();i++)
        {
            a[i]=m.get(i);
        }
       /*  for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        } */
        return a;
    }
}