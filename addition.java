import java.util.scanner
public class addition{
    public static void main(string[]args){
        scanner scanner = new scanner(system.in);
        system.out.println("Enter the first number");
        int a = scanner.nextInt();

        system.out.println("Enter the second number");
        int b = scanner.nextInt();

        system.out.println("Enter the third number");
        int c = scanner.nextInt();

        int sum = a + b + c;

        system.out.println("The sum of"+a+","+b+"and"+c+"is"+sum);

        scanner.close();
    }
}