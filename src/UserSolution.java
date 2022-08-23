public class UserSolution {
    public static long[] oddRow(int n) {
        long[] result = new long[n];
        for (int i=0;i<n;i++) {
            result[i] = (long) n*n-n+1 + 2*i;
        }
        return result;
    }
}