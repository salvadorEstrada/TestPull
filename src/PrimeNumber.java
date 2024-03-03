import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(4));

    }


    public static boolean isPrime(int N) {
        return N > 1 & IntStream
                .range(2, N)
                .noneMatch(n -> N % n == 0);
    }

}
