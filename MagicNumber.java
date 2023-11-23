package dsa;

public class MagicNumber {

    public static void main(String[] args) {
        int arr[] = new int[] {12, 15, 33, 22, 7, 8, 13, 28};
        int N = 5;
        int result = countMagic(arr, N);
        System.out.println("Count of Magic number: " + result);
    }

    private static int countMagic(int[] arr, int N) {
        int count = 0;

        for (int num : arr) {
            int productOfDigits = 1;
            int sumOfDigits = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                productOfDigits *= digit;
                sumOfDigits += digit;
                temp /= 10;
            }

            if (productOfDigits % N == 0 && sumOfDigits % N == 0) {
                count++;
            }
        }

        return count;
    }
}
