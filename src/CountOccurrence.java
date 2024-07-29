import java.util.*;
public class CountOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = input.nextLine();
        char[] str1CharArray = str1.toCharArray();
        char ch = input.next().charAt(0);
        int count=0;
        for(int i=0; i<str1CharArray.length; i++){
            if(str1CharArray[i]==ch)
                count++;

        }

        System.out.println(count);
    }
}