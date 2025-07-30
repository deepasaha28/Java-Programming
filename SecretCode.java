import java.util.Scanner;

public class SecretCode {

    // Method to calculate the power of a base raised to an exponent
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Calculate power(s, n) % 10
        int baseResult = power(s, n) % 10;
        
        // Calculate power(baseResult, m) % 1000000007
        int res = power(baseResult, m) % 1000000007;
        
        // Output the result
        System.out.println(res);
        
        scanner.close();
    }
}


