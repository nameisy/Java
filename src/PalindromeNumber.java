public class PalindromeNumber {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("=============");
            System.out.println("Sayı => " + temp);

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        return true;
    }
    public static void main(String[] args) {
        isPalindrom(9889);
    }
}