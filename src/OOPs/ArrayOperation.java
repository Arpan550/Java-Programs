package OOPs;

public class ArrayOperation {

    public static class Statistics {

        public static double mean(double[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }

        public static double median(double[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            // Sort the array
            java.util.Arrays.sort(numbers);

            int middle = numbers.length / 2;
            if (numbers.length % 2 == 1) {
                return numbers[middle];
            } else {
                return (numbers[middle - 1] + numbers[middle]) / 2.0;
            }
        }

        public static double standardDeviation(double[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty");
            }

            double mean = mean(numbers);
            double sumSquaredDiff = 0;
            for (double num : numbers) {
                sumSquaredDiff += Math.pow(num - mean, 2);
            }
            return Math.sqrt(sumSquaredDiff / numbers.length);
        }
    }

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};

        // Compute and print statistics
        System.out.println("Mean: " + Statistics.mean(arr));
        System.out.println("Median: " + Statistics.median(arr));
        System.out.println("Standard Deviation: " + Statistics.standardDeviation(arr));
    }
}
