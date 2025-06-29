/*Given N. print the Latin Matrix (say N = 3). condition:  must not use strings(aka character literals), arrays (both 1D and 2D), inbuilt functions(like rotate).
A   B   C
B   C   A
C   A   B*/
import java.util.*;
public class A22LatinMatrix {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        char ans;
        int n=s1.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans= (char) (65 +(i+j)%n);
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
