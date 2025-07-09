import java.util.*;
public class PrimeSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.of values: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        int n1 = s.nextInt();
        int sum = 0; int count = 0;

        for (int i = 0; i < n; i++) {
            int num = i;
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                sum += a[i];
            } else {
                count += a[i];
            }
        }

        if (n1 == 1) {
            System.out.println(sum);
        } else {
            System.out.println(count);
        }

        s.close();
    }
}
