public class Main {

    public static void swap(int[] arr, int i , int j ){
         int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, left, j);
        return j;

    }

    public static void quickSort(int[] arr, int left, int right){
        int pivot;
        if(left < right){
            pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);   
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10,7,8,8,7,9,1,5};
        int n = arr.length;

        quickSort(arr, 0, n- 1);
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");

       
    }
    
}
