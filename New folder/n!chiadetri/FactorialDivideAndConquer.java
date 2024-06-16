public class FactorialDivideAndConquer {

    // Hàm chia để trị tính giai thừa
    private static long factorial(int low, int high) {
        if (low > high) {
            return 1;
        }
        if (low == high) {
            return low;
        }
        
        int mid = (low + high) / 2;
        
        long leftFactorial = factorial(low, mid);
        long rightFactorial = factorial(mid + 1, high);
        
        return leftFactorial * rightFactorial;
    }

    // Hàm chính để khởi động quá trình tính giai thừa
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n phải là số không âm.");
        }
        return factorial(1, n);
    }

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        int n = 5; // Ví dụ với n = 5
        System.out.println(n + "! = " + factorial(n));
    }
}
