import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int digitCount = countDigits(num);
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += calcPower(temp % 10, digitCount);
            temp /= 10;
        }
        return sum == num;
    }

    public static int countDigits(int n) {
        return Integer.toString(n).length();
    }

    public static int calcPower(int base, int exponent) {
        int product = 1;
        for (int i = 0; i < exponent; i++) {
            product *= base;
        }
        return product;
    }
}
