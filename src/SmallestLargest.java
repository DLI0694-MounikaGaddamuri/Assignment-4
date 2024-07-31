import java.util.Scanner;
public class SmallestLargest {

    public static void smallest(int start, int end, int target, int[] array){
        for(int i=start; i<=end;i++){
            if(array[i]>=target){
                System.out.println("Smallest element that is greater than or equal to "+target+" is: "+array[i]);
                break;
            }
        }
    }

    public static void largest(int start, int end, int target, int[] array){
        for(int i=end; i>=start;i--){
            if(array[i]<=target){
                System.out.println("Largest element that is smaller than or equal to "+target+" is: "+array[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        System.out.println("Enter element: ");
        int element = input.nextInt();

        int start=0,end=array_size-1,k=0;
        int mid=0;
        while(start<=end) {
            mid = (start + end) / 2;
            if(array[mid]==element){
                k=1;
                start=mid+1;
                break;
            }
           else if (element > array[mid])
                start = mid + 1;

            else
                end = mid - 1;
        }
        if(k==1)
            smallest(start,array_size-1,element,array);
        else
            System.out.println("Element not found");

        //largest
        start=0;
        end=array_size-1;
        mid=0;
        while(start<=end) {

            mid = (start + end) / 2;
            if(array[mid]==element){
                k=1;
                start=0;
                break;
            }
            else if (element <= array[mid])
                end = mid - 1;

            else
                start = mid + 1;
        }
        if(k==1)
            largest(start,end,element,array);
        else
            System.out.println("Element not found");


//        mid=0;
//        mid=(start+end)/2;
//        if(element<=array[mid])
//            end = mid+1;
//        else
//            start=mid-1;
//        //System.out.println(start+" "+end);
//        largest(start,end,element,array);
    }
}
