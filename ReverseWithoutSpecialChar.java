/*Given a string, we have to reverse the string without changing the position of punctuations and spaces.
 
Sample:   house no : 123@ cbe 
Output:    ebc32 1o :  nes@ uoh */


import java.util.*;
public class A28ReverseWithoutSpl {
    static boolean spl(int a){
        return ('A'<=a&&a<='Z' || 'a'<=a&&a<='z' || '0'<=a&&a<='9')?false:true;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j;
        String a=s1.nextLine();
        char []s=new char[a.length()];
        for(i=0;i<a.length();i++){
            s[i]=a.charAt(i);
        }
        i=0;j=s.length -1;
        while(i<=j){
            if(spl(s[i])){
                i++;continue;
            }
            if(spl(s[j])){
                j--;continue;
            }
            s[i]=(char)(s[i]+s[j]-(s[j]=s[i]));
            i++;j--;
        }
        for(i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }
}
