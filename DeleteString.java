/*Remove the duplicates in the String.
        Testcase 1:
        Input: Java1234
        Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
        Testcase 2:
        Input: Python1223:
        Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
        Testcase 3:
        Input: aBuzZ9900
        Output: aBuzC9012
        (Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as the letter to be replaced is capital Z. The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)
*/
import java.util.*;
public class DeleteString {
    public static char change(char a) {
        if (a == '9')
            a= '0';
        else if (a == 'z')
            a= 'a';
        else if (a == 'Z')
           a= 'A';
        else {
            a= (char) (a + 1);
        }
        return a;
    }

    public static char check(int j, char[] a, int len) {
        for (int i = 0; i < j; i++) {
            if (a[i] == a[j] || a[i] + 32 == a[j] || a[i] - 32 == a[j] || a[i] == a[j] + 32 || a[i] == a[j] - 32) {
                a[j] = change(a[j]);
                check(j, a, len);
            }
        }
        return a[j];
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, j;
        String str = s1.nextLine();
        char[] a = new char[str.length()];
        for (i = 0; i < str.length(); i++) {
            a[i] = str.charAt(i);
        }
        int len = a.length;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] || a[i] + 32 == a[j] || a[i] - 32 == a[j] || a[i] == a[j] + 32 || a[i] == a[j] - 32) {
                    a[j]=change(a[j]);
                   a[j]= check(j, a, len);
                }
            }

        }
        for(i=0;i<len;i++){
            System.out.print(a[i]);
        }

    }
}



