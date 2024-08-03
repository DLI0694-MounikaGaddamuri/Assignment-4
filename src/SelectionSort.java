import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int array_size=input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        int minIndex=-1;
        for(int i=0;i<array_size-1;i++){
            minIndex=i;
            for(int j=i+1;j<array_size;j++){
                if(array[minIndex] > array[j])
                    minIndex=j;
            }
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;

        }

        System.out.println(Arrays.toString(array));
    }
}
