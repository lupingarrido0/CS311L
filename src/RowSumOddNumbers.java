public class RowSumOddNumbers {
    static int rowSumOddNumbers(int n) {
        int firstInNthRow = n * n - (n - 1);
        int lastInNthRow = firstInNthRow + (n - 1) * 2;
        return (firstInNthRow + lastInNthRow) * n / 2;
    }

    static int rowSumOddNumbers2(int n) {
        return n * n * n;
    }
}
