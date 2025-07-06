/*Write a program that will take one string as input. The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string. If there are two or more vowels that occur together then the program shall ignore all of those vowels.
Example 1
Input:  Cat
Output:  Ct
Example 2
Input:  Compuuter
Output: Cmpuutr*/

import java.util.*;
public class DeleteSingleVowel {
    public static boolean  vowel( int n) {
        if (n == 'a' || n == 'A' || n == 'e' || n == 'E' || n == 'i' || n == 'I' || n == 'o' || n == 'O' || n == 'u' || n == 'U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,k;
        String s=s1.nextLine();
        char []a=new char[s.length()];
        for(i=0;i<s.length();i++){
            a[i]=s.charAt(i);
        }
        int len=a.length;
        for(i=0;i<len;i++){
                if(vowel(a[i])){
                    if(vowel(a[i]) != vowel(a[i+1])){
                        for(k=i;k<len-1;k++){
                            a[k]=a[k+1];
                        }
                        i--;len--;
                    }
                    else{

                        System.out.print(a[i]);
                        System.out.print(a[i+1]);i++;
                    }
            }

            else{
                System.out.print(a[i]);
            }
        }
    }
}
