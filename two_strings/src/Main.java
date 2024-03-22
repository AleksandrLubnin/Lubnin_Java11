import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //two strings
        System.out.println("Введите две строки");
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        //Сomparing two strings
        if (a.equals (b)) {
            System.out.println ("Строки идентичны");
        } else {
            System.out.println ("Строки неидентичны");
        }
    }
}