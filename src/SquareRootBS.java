import java.util.Scanner;

public class SquareRootBS {

    public static int squareRoot(int array[],int low,int high,int number){
        int mid;

        while(low<=high){
            mid=(low+high)/2;
            if((mid*mid) <= number)
                low=mid+1;
            else
                high=mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int array_size=input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        System.out.println("Enter the number to find square root: ");
        input.nextLine();
        int search_element=input.nextInt();

        int result=squareRoot(array,1,search_element,search_element);
        System.out.println("Square root of "+search_element+" is:"+result);
    }
}
