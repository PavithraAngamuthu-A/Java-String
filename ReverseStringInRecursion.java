/*Using Recursion reverse the string such as
Eg 1: Input: one two three
        Output: three two one
Eg 2: Input: I love india
        Output: india love I*/
import java.util.*;
import static java.lang.System.exit;
public class ReverseStringInRecursion {
    public static void reverse(char []a,int n,int end){
        int i,j,start=0;
        for(i=end;i>=0;i--){
            if(a[i]==' ' || i==0){
                if(i==0){
                    start=i;
                }
                else{
                    start=i+1;
                }
                for(j=start;j<=end;j++){
                    System.out.print(a[j]);
                }
                if(i==0){
                    exit(0);
                }
                System.out.print (" ");
                end=i-1;
                reverse(a,n,end);
            }

        }
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i,j;
        String s = s1.nextLine();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++){
            a[i]=s.charAt(i);
        }
        int n=s.length();
        reverse(a,n,n-1);

    }
}
