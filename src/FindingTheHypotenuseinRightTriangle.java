import java.util.Scanner;

public class FindingTheHypotenuseinRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter leg 1..:");
        int leg1 = scanner.nextInt();
        System.out.print("Please Enter leg 2..:");
        int leg2 = scanner.nextInt();
        System.out.print("Please Enter leg 3..:");
        int leg3 = scanner.nextInt();

        //Calculate Triangle Circumference
        int circumference = (leg1 + leg2 + leg3);
        int halfOfCircumference = circumference / 2;
        int area = halfOfCircumference * (halfOfCircumference - leg1) * (halfOfCircumference - leg2) * (halfOfCircumference - leg3);
        int sqrt = (int) Math.sqrt(area);
        System.out.println("Area is..:" + sqrt);
    }
}
