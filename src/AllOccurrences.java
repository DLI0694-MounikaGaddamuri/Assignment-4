import java.util.*;
public class AllOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = input.nextLine();
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        for(int i=0;i<str1.length();i++){
            if(ch==str1.charAt(i))
                System.out.print(i+" ");
        }
    }
}
