import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Search substring = new Search();
        Scanner userStrInput = new Scanner(System.in);

        System.out.println("Enter a string: ");
        final String __str = userStrInput.next();

        System.out.println("Enter the substring to be searched: ");
        final String __substr = userStrInput.next();

        int val = substring.substrSearch(__substr, __str);
        int __substrLength = substring.getSubstrLength();
        if(val == -1){
            System.out.println("False");
        }
        else {
            System.out.println("Present at index " + val + " to index " + (val + __substrLength));
        }
        userStrInput.close();
    }
}
