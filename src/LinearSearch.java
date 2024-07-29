import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = input.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
            array1[i]=input.nextInt();
        System.out.println("Enter the element to search: ");
        int searchElement = input.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            if(array1[i]==searchElement){
                k=1;
                System.out.println("Element found at index: "+i);
            }
        }
        if(k==0) System.out.println("Element not found");
    }
}