
public class Discount {

    // Function to check if a bill amount is a perfect square
    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    public static void main(String[] args) {
        // Bill amounts for nine customers
        int[] customerBillAmounts = {25, 77, 54, 81, 48, 34};
        int count = 0;

        // Count how many customers have bill amounts that are perfect squares
        for (int amount : customerBillAmounts) {
            if (isPerfectSquare(amount)) {
                count++;
            }
        }

        // Display the number of customers with perfect square bill amounts
        System.out.println(count);
    }
}

