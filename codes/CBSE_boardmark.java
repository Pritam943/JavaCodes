import java.util.Scanner;

public class CBSE_boardmark {

    public static void main(String []args) {

        System.out.println("Hy Pritam enter your board marks");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your 1st subject mark:");
        int a = sc.nextInt();

        System.out.println("enter your 2nd subject mark:");
        int b = sc.nextInt();

        System.out.println("enter your 3rd subject mark:");
        int c = sc.nextInt();

        System.out.println("enter your 4th subject mark:");
        int d = sc.nextInt();

        System.out.println("enter your 5th subject mark:");
        int e = sc.nextInt();

        double sum = (a + b + c + d + e);
        double result = sum * 100 / 500;

        System.out.println("your result in percentage: " + result + "percentage");

    }
}
