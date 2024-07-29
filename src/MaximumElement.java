import java.util.*;
public class  MaximumElement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int array3Size = input.nextInt();
        int[] array3 = new int[array3Size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array3Size;i++)
            array3[i]=input.nextInt();
        int maxElement=array3[0];
        for(int i=0;i<array3Size;i++){
            if(array3[i]>maxElement)
                maxElement=array3[i];
        }
        System.out.println("Maximum Element in the list is: "+maxElement);
    }
}