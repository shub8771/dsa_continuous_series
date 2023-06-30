//first negative number in every window size of k

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class first{
    public static void main(String[] args) {
        // int a[]={12, -1, -7, 8, -15, 30, 16, 28};
        int a[]={-8, 2, 3, -6, 10};
        int k=2;
        int n=a.length;
        // int k=3;
        System.out.println(negative(a, n, k));
    }
    static ArrayList<Integer> negative(int arr[],int n,int k){
        ArrayList<Integer> m=new ArrayList<>();
        int i=0;
        int j=0;
        Queue<Integer> y=new LinkedList<Integer>();
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
                    m.add(0);
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
        return m;
    }
}