package functional_programming;

public class TestInterface {
    public static void main(String[] args) {
        Candidate can = num -> {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(can.isCandidate(5));

    }
}
