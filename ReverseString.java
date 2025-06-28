/*Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining white Spaces.
example: String1 = Input: This is a test String only String2 = st Output: This is a only String test*/
import java.util.*;
public class ReverseString {
    static void finalPrint(char []a,int temp){
        int i,j,start,end;
        for(i=0;i<=temp;i++){
            System.out.print(a[i]);
        }

        end=a.length-1;
        for(i=a.length-1;i>=temp;i--){
            if(a[i]==' '||i==temp){
                if(a[i]==' '){
                    start=i+1;
                }
                else{
                    start=i;
                }
                for(j=start;j<=end;j++){
                    System.out.print(a[j]);
                }
                end=i-1;
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int temp=0,found=0;
        String str=s1.nextLine();
        String str2=s1.next();
        char[]a=new char [str.length()];
        for(int i=0;i<str.length();i++){
            a[i]=str.charAt(i);
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==str2.charAt(0)&&a[i+1]==str2.charAt(1)){
                for(int j=i;j>=0;j--){
                    if(a[j]==' '){
                        temp=j;found=1;break;
                    }
                }
            }
            if(found==1){
                break;
            }
        }
        System.out.println(temp);
        finalPrint(a,temp);

    }


}
