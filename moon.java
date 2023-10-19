import java.util.*;

public class moon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        int count = 0;

        // Calculate the first day Takahashi can see a full moon within the range.
        int firstFullMoonDay = m;

        // Calculate the number of full moons within the range.
        while (firstFullMoonDay <= n) {
            count++;
            firstFullMoonDay += p;
        }

        System.out.println(count);
    }
}
