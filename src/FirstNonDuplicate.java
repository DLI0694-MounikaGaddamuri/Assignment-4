import java.util.*;
public class FirstNonDuplicate{

    public static int countOfCharacter(char[] str1Array,char ch){
        int count=0;
        for(int i=0;i<str1Array.length;i++){
            if(ch==str1Array[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = input.nextLine();
        char[] str1Array= str1.toCharArray();

        int count[]=new int[str1Array.length];
        for(int i=0;i<str1Array.length;i++)
            count[i]=countOfCharacter(str1Array,str1Array[i]);

        for(int i=0;i<str1Array.length;i++){
            if(count[i]==1) {
                System.out.println(str1Array[i]);
                break;
            }
        }

    }
}