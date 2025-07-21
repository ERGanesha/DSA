package DSA;

public class Techinques {
        public static void main(String[] args) {
            int[] arr = {5, 7};
            int n = arr.length;

            int totalSum = 0;

            for (int i = 0; i < n; i++) {
                int count = (i + 1) * (n - i);
                int contribution = arr[i] * count;
                totalSum += contribution;

                System.out.println("A[" + i + "] = " + arr[i] +
                        ", appears in " + count + " subarrays, contribution = " + contribution);
            }

            System.out.println("Total sum of all subarray sums: " + totalSum);
        }


}
