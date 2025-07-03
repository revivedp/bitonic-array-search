public class Main {

    public static int findPeakIndex(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low < high){
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int binarySearchUp(int[] arr, int low, int high, int target){
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int binarySearchDown(int[] arr, int low, int high, int target){
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int bitonicSearch(int[] arr, int target){
        int peak = findPeakIndex(arr);
        int index = binarySearchUp(arr, 0, peak, target);
        if (index != -1) return index;
        return binarySearchDown(arr, peak + 1, arr.length - 1, target);
    }

    public static void main(String[] args) {
        if (args.length == 0 || args.length == 1) return;
        int[] bitonicArray = new int[args.length-1];
        int target = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++){
            try{
                bitonicArray[i] = Integer.parseInt(args[i+1]);
            } catch (ArrayIndexOutOfBoundsException e){
                continue;
            }
            System.out.println(bitonicArray[i]);
        }
        int result = bitonicSearch(bitonicArray, target);
        if (result != -1) System.out.println("Found " + target + " at index " + result);
    }
}
