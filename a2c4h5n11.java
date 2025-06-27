/*input = a2c4h5n11 output =aacccchhhhhnnnnnnnnnnn*/
import java.util.*;
public class a2c4h5n11 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String a=s1.next();
        int i=0,j,num=0;
        char temp;
        while(i<a.length()){
            if(!('0'<=a.charAt(i) && a.charAt(i)<='9')){
                temp=a.charAt(i);
                i++;
                num=0;
                while(i < a.length() &&'0'<=a.charAt(i) &&a.charAt(i)<='9'){
                    num=num*10+(a.charAt(i)-48);
                    i++;
                }
                for(j=0;j<num;j++){
                    System.out.print(temp);
                }
            }
            else{
                i++;
            }

            }
        }
    }
