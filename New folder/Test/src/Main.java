import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền can đổi: ");
        int n = sc.nextInt();

        int[] coinValues = {5000, 2000, 1000, 500};
        int[] coinCount = new int[coinValues.length];

        int remainCount = n;

        for(int i = 0; i < coinValues.length; i++){
            coinCount[i] = remainCount / coinValues[i];
            remainCount = remainCount % coinCount[i];

        }

        System.out.println("Kết quả đổi tien: ");
        for(int i = 0; i < coinValues.length; i++){
            if(coinCount[i] > 0){
                System.out.println("Đồng giá: " + coinValues[i] + ": " + coinCount[i] + "đồng");
            }
        }

    }
}