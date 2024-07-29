import java.util.*;
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n3=input.nextInt();
        int[] array2 = new int[n3];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n3 ;i++)
            array2[i]=input.nextInt();
        System.out.println("Enter the number which you want to find the first occurrence: ");
        int findOccurrence = input.nextInt();
        int flag1=0;
        for(int i=0; i<n3; i++){
            if(array2[i]==findOccurrence){
                flag1=1;
                System.out.println("Index of the first occurrence of number is: "+i);
                break;
            }
        }
        if(flag1==0) System.out.println("Element not present in the lsit.");
    }
}