/*input = He speaks malayalam output = He speaks*/
import java.util.*;
public class RemovePalindrome {
    static boolean palindrome(String a){
        int j=a.length()-1,i=0,count=0;
        while(i<=j){
            if(a.charAt(i)==a.charAt(j)){
                count++;i++;j--;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        String[]a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=s1.next();
        }
        for(int i=0;i<n;i++){
            if(palindrome(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
}
