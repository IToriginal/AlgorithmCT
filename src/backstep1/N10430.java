package backstep1;

import java.util.Scanner;

public class N10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println((a+b) % c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b) % c);
        System.out.println((a%c * b%c)%c);
    }
}


/*
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		in.close();

		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );

	}

}
 */