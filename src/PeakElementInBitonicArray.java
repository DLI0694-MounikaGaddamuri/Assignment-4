public class PeakElementInBitonicArray {
    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // This line will never be reached if the array is bitonic
    }

    public static void main(String[] args) {
        int[] bitonicArray = {1, 3, 8, 12, 4, 2};
        int peak = findPeakElement(bitonicArray);
        System.out.println("The peak element is: " + peak);
    }
}
