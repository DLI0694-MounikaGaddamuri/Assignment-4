import java.util.*;
public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string array size:");
        int n= input.nextInt();
        String[] stringArray = new String[n];
        System.out.println("Enter the string elements: ");
        for(int i=0; i<n; i++)
            stringArray[i]=input.next();
        input.nextLine();
        System.out.println("Enter the element to search: ");
        String searchElement1 = input.nextLine();
        int flag=0;
        for(int i=0; i<n ;i++){
            if(stringArray[i].equals(searchElement1)){
                flag=1;
                System.out.println("Element found at index: "+i);
            }
        }
        if(flag==0) System.out.println("Element not found");
    }
}