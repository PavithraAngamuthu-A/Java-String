/*Print longest sequence between same character

Ex I/p abcccccbba
O/p 8 (from a to a)
I/p aaaaaaaa
O/p 6*/

import java.util.*;

import static java.lang.System.exit;

public class A60LongestSequence {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int count=0,i,j;
        String a=s1.nextLine();
        char []b=a.toCharArray();
        for(i=0;i<b.length;i++){
            for(j=b.length;j>=0;j--){
                if(b[j] == b[i]){
                    for(int k=i+1;k<j;k++){
                        count++;
                    }
                    exit(0);
                }
            }
        }
        System.out.println(count);
    }
}
