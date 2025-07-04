/*input = 12345*+-+ output = 6 (explanation 1*2+3-4+5)*/
import java.util.*;
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,temp=0;
        String n=s1.nextLine();
        char []a=new char[n.length()];
        for(i=0;i<n.length();i++){
            a[i]=n.charAt(i);
        }
        for(i=0;i<n.length();i++){
            if(!('0'<=a[i]&&a[i]<='9')){
                temp=i;break;
            }
        }
        int k = a[0]-48;
        for(i=1;i<temp;i++){
            int x=i+temp-1;
            if(a[x]=='+'){
                k=k+(a[i]-48);
            }
            else if(a[x]=='-'){
                k=k-(a[i]-48);
            }
            else if(a[x]=='*'){
                k=k*(a[i]-48);
            }
            else if(a[x]=='/'){
                k=k/(a[i]-48);
            }
        }
        System.out.println(k);
    }
}
