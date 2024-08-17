import java.util.Scanner;

public class MergeSort {

    public void merge(int array[],int start,int mid,int end){
        int size1=mid-start+1;
        int size2=end-mid;

        int[] left_array=new int[size1];
        int[] right_array=new int[size2];

        for(int i=0;i<size1;i++)
            left_array[i]=array[start+i];
        for(int j=0;j<size2;j++)
            right_array[j]=array[mid+1+j];

        int i=0,j=0,k=start;

        while(i<size1 && j<size2){
            if(left_array[i]<=right_array[j]){
                array[k]=left_array[i];
                i++;
            }
            else{
                array[k]=right_array[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            array[k]=left_array[i];
            k++;
            i++;
        }
        while(j<size2){
            array[k]=right_array[j];
            k++;
            j++;
        }
    }

    void sort(int array[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;

            sort(array,start,mid);
            sort(array,mid+1,end);

            merge(array,start,mid,end);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        int array_size=input.nextInt();
        int[] array= new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();

        MergeSort ms = new MergeSort();
        ms.sort(array,0,array_size-1);

        for(int i=0;i<array_size;i++)
        System.out.print(array[i]+" ");
    }
}
