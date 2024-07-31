//
//import java.util.*;public class FirstLastOccurrence {
//
//    public static void lastOccurrence(int start,int end,int target,int[] array){
//        for(int i=end;i>=start;i--){
//            if(array[i]==target){
//                System.out.println("Last Occurrence: "+i);
//                break;
//            }
//               // return i;
//        }
//        //return -1;
//    }
//
//    public static void firstOccurrence(int start,int end,int target,int[] array){
//        for(int i=start;i<=end;i++){
//            if(array[i]==target){
//                System.out.println("First Occurrence: "+i);
//                break;
//            }
//        }
//        //return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int array_size = input.nextInt();
//        int[] array = new int[array_size];
//        System.out.println("Enter array elements: ");
//        for(int i=0;i<array_size;i++)
//            array[i]=input.nextInt();
//        System.out.println("Enter element: ");
//        int element = input.nextInt();
//        int start=0,end=array_size-1;
//        int mid=0;
//            mid=(start+end)/2;
//            if(element>=array[mid]) {
//                start = mid;
//
//                //System.out.println(firstOccurrence(0,mid,element,array));
//            }
//            else
//                end=mid-1;
//        //System.out.println(start+" "+end);
//       lastOccurrence(start,end,element,array);
//
//        start=0;
//        end=array_size-1;
//        mid=0;
//            mid=(start+end)/2;
//            if(element<=array[mid]) {
//                end = mid;
//                //System.out.println(firstOccurrence(0,mid,element,array));
//            }
//            else start=mid+1;
//        //System.out.println(start+" "+end);
//        firstOccurrence(start,end,element,array);
//
//    }
//}
