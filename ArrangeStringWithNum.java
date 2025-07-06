/*Given a sentence with numbers representing a word’s location in the sentence, embedded within each word, and return the sorted sentence.
Note: We are using a maximum of 0-9 numbers only for 1 sentence
Example 1
Input:  is1 Thi0s T3est 2a
Output:  This is a Test
Example 2
Input:  t2o j3oin 4WonderBiz I0 Technolog5ies wan1t
Output:  I want to join WonderBiz Technologies*/

import java.util.*;
public class ArrangeStringwithNum {
    public static int findDigit(String n){
        int i,j;
        for(i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if('0'<=ch&&ch<='9'){
                return ch - '0' ;
            }
        }
        return 0;
    }
    public static void removeNum(String n){
        int i,j;
        for(i=0;i<n.length();i++) {
            char ch = n.charAt(i);
            if (!('0' <= ch && ch <= '9')) {
                System.out.print(ch);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, j=0, k=0, sp = 0;

        String s = s1.nextLine();
        char[] a = new char[s.length()];
        for (i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        String[]b=new String[100];
        String temp ="";
        for(i=0;i<a.length;i++){
            if(a[i]!=' '){
                 temp +=a[i];
            }
            else{
                b[k++]=temp;temp="";
            }
        }
        if(!temp.equals("")){
            b[k++]=temp;
        }
        for(i=0;i<k;i++){
            for(j=i+1;j<k;j++){
                int num1=findDigit(b[i]);
                int num2=findDigit(b[j]);
                if(num1>num2){
                   String t=b[j];
                   b[j]=b[i];
                   b[i]=t;
                }
            }
        }
        for(i=0;i<k ;i++){
            removeNum(b[i]);
            System.out.print(" ");
        }
    }

}
