/*input a= silent,b=listen  output = true*/
import java.util.*;

import static java.lang.System.exit;

public class CheckAnagram {
    public static char[] sort(char[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i]=(char)(a[i]+a[j]-(a[j]=a[i]));
                }
            }
        }
        return a;
    }
    public static char[] change(String a){
        char []b=new char [a.length()];
        for(int i=0;i<a.length();i++){
            b[i]=a.charAt(i);
        }
        return sort(b);
    }
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        String a1=s1.next();
        String b1=s1.next();

        if(a1.length()!=b1.length()){
            System.out.println("Not Anagaram");
        }
        else{
            char []a=change(a1);
            char []b=change(b1);

            for(int i=0;i<a.length;i++){
                if(a[i]==b[i]){
                   continue;
                }
                else{
                    System.out.println("Not Anagaram");exit(0);
                }
            }
            System.out.println("Anagram");
        }
    }
}
