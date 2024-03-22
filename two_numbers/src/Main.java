import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Two numbers
        System.out.println("Введите два числа a и b");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        // Comparing two numbers
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        //Operations on numbers: addition, subtraction, multiplication, division
        int sum = a + b;
        int differenceab = a - b;
        int differenceba = b - a;
        int multiplication = a * b;
        double divisionab = (double) a / b;
        double divisionba = (double) b / a;
        System.out.println("Сумма a+b=" + sum);
        System.out.println("Разница a-b=" + differenceab);
        System.out.println("Разница b-a=" + differenceba);
        System.out.println("Прозведение a*b=" + multiplication);
        System.out.println("Деление a/b=" + divisionab);
        System.out.println("Деление b/a=" + divisionba);
    }
}