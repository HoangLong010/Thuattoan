public class MaximumSubarray {
    // Hàm tìm dãy con có tổng lớn nhất qua điểm giữa
    private static int maxCrossingSum(int[] arr, int left, int mid, int right) {
        // Tìm tổng lớn nhất ở phía bên trái của điểm giữa
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        // Tìm tổng lớn nhất ở phía bên phải của điểm giữa
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        // Trả về tổng lớn nhất qua điểm giữa
        return leftSum + rightSum;
    }

    // Hàm đệ quy tìm dãy con có tổng lớn nhất
    private static int maxSubArraySum(int[] arr, int left, int right) {
        // Nếu mảng chỉ có một phần tử
        if (left == right) {
            return arr[left];
        }

        // Tìm điểm giữa của mảng
        int mid = (left + right) / 2;

        // Tìm tổng lớn nhất ở nửa trái, nửa phải và qua điểm giữa
        int leftSum = maxSubArraySum(arr, left, mid);
        int rightSum = maxSubArraySum(arr, mid + 1, right);
        int crossSum = maxCrossingSum(arr, left, mid, right);

        // Trả về giá trị lớn nhất trong ba giá trị trên
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    // Hàm chính để tìm dãy con có tổng lớn nhất
    public static int findMaxSubArray(int[] arr) {
        return maxSubArraySum(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 9};
        int maxSum = findMaxSubArray(arr);
        System.out.println("Tổng lớn nhất của dãy con liên tiếp là: " + maxSum);
    }
}
