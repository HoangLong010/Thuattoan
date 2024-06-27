import java.util.Arrays;

public class MergeSort {
    
    // Hàm để sắp xếp mảng bằng thuật toán Merge Sort
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    
    // Hàm để hợp nhất hai mảng con lại với nhau
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(array));
        
        mergeSort(array);
        
        System.out.println("Mảng sau khi sắp xếp:");
        System.out.println(Arrays.toString(array));
    }
}
