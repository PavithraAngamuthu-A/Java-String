/* Print all possible subsets of the given array whose sum equal to given N.
example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}*/

import java.util.*;
public class SumOfSubsets {
    public static void backTrack(int n,int[]a,int index,int sum,int target,List<Integer>current) {
        if(target==sum) {
            System.out.println(current);
            return;
        }
        if(target<sum||index==a.length) {
            return;
        }
        current.add(a[index]);
        backTrack(n,a,index+1,sum+a[index],target,current);
        current.remove(current.size()-1);
        backTrack(n,a,index+1,sum,target,current);


    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j;
        int n=s1.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        int target=s1.nextInt();
        List<Integer>current=new ArrayList<Integer>() ;
        backTrack(n,a,0,0,target,current);
        }
    }

