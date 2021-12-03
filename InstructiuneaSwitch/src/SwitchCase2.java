import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti luna curenta");
        String lunaCurenta = sc.nextLine();

        switch (lunaCurenta) {
            case "decembrie":
            case "ianuarie":
            case "februarie":
                System.out.println("Este iarna");
                break;

            case "martie":
            case "aprilie":
            case "mai":
                System.out.println("Este primavara");
                break;

            case "iunie":
            case "iulie":
            case "august":
                System.out.println("Este vara");
                break;

            case "septembrie":
            case "octombrie":
            case "noimebrie":
                System.out.println("Este toamna");
                break;

            default:
                System.out.println("Nu ai introdus o luna valida");
        }
    }
}
