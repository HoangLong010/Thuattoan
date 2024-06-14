import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần đổi: ");
        int n = scanner.nextInt();

        int[] coinValues = {5000, 2000, 1000, 500};
        int[] coinCount = new int[coinValues.length];

        int remainAmount = n;

        for(int i = 0; i < coinValues.length; i++){
            coinCount[i] = remainAmount / coinValues[i];
            remainAmount = remainAmount % coinValues[i];
            if(remainAmount == 0){
                continue;
            }
        }

        System.out.println("Kết quả đổi tiền: ");
        for(int i =0 ; i <coinValues.length; i++){
            if(coinCount[i] > 0){
                System.out.println("Đồng " + coinValues[i] + ": " + coinCount[i] + " đồng");
            }
        }
    }
}
