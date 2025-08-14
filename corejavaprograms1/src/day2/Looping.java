package day2;

public class Looping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Using FOR loop: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("For Loop: " + i);
        }

        System.out.println("Using WHILE loop: ");
        int j = 1;
        while (j <= n) {
            System.out.println("While Loop: " + j);
            j++;
        }
        System.out.println("Using DO-WHILE loop: ");
        int k = 1;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k <= n);
	}

}
