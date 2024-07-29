import java.util.Scanner;

public class PositionOfTargetElement {
    public static int binarySearch(int array[], int searchElement){
        int start=0,end=array.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(searchElement==array[mid])
                return mid;
            else if(searchElement>array[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int array_size=input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        System.out.println("Enter the element to search: ");
        input.nextLine();
        int search_element=input.nextInt();
        System.out.println(binarySearch(array,search_element));
    }
}
