import java.util.*;

public class AverageTotal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int n =s.nextInt();
        float avg = 0;
        String[] name = new String[n];
        int[] mark = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("name: ");
            name[i] = s.next();
            System.out.print("mark: ");
            mark[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + mark[i]);
            avg += mark[i];
        }

        System.out.printf("average: %.4f\n", avg / n); 
        s.close();
    }
}
