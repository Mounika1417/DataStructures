package dynamicprogramming;

public class LISDemo {

    static int max_ref; // This will store the final LIS length

    // Helper function to find LIS ending at n-1
    static int _lis(int arr[], int n) {
        // Base case
        if (n == 1)
            return 1;

        int res, max_ending_here = 1; // length of LIS ending at n-1

        // Recursively get all LIS ending at arr[0]..arr[n-2]. If arr[i-1]
        // is smaller than arr[n-1], and the LIS ending at arr[n-1] needs to
        // be updated, then update it
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here) {
                max_ending_here = res + 1;
            }
        }

        // Compare max_ending_here with the overall max and update if needed
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;

        return max_ending_here;
    }

    // The wrapper function for _lis()
    static int lis(int arr[], int n) {
        max_ref = 1; // Initialize the global variable
        _lis(arr, n);
        return max_ref;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int n = arr.length;
        System.out.println("Length of Longest Increasing Subsequence is: " + lis(arr, n));
    }
}