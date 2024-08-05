import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int array_size=input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        for(int i=1;i<array_size;i++){
            int key=array[i];
            int j=i-1;
            while(array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        for(int i=0;i<array_size;i++)
            System.out.print(array[i]+" ");
    }
}
