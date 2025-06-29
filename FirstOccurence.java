/*First Occurrences
Given two strings, find the first occurrence of all characters of second string in the first string and
print the characters between the least and the highest index
I/P: ZOHOCORPORATION PORT
O/P: OHOCORPORAT*/
package ZohoPdfTest;
import java.util.*;
public class A33FirstOccurence {
    public static void check(char[]a,char []b){
        int i,j,max=0,min=1;
        for(i=0;i<b.length;i++){
            for(j=i+1;j<a.length;j++){
                if(b[i]==a[j]){
                    if(max<=j){
                        max=j;
                    }
                    else if(min>=j){
                        min=j;
                    }break;
                }
            }

        }
        for(i=min;i<=max;i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String a=s1.nextLine();
        String b=s1.nextLine();
        char []a1=a.toCharArray();
        char []b1=b.toCharArray();
        check(a1,b1);
    }
}
