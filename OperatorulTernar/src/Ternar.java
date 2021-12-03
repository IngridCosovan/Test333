import java.util.Scanner;

public class Ternar {


    //Ne permite sa definim expresii in Java cu o forma copirmata a instructiunii if/else, care va returna o valoare
    //Va returna intotdeauna o expresie de tip boolean
    // Rezultat = conditie ? valoare 1 : valoare 2;
    //daca conditia = true atunci rezultatul este valoare 1
    //daca conditia = false atunci rezultatul este valoare 2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ce varsta aveti?");
        int varsta = sc.nextInt();
        if (varsta >= 18) {
            System.out.println("Esti major.");
        } else {
            System.out.println("Esti minor.");
        }

        System.out.println(varsta>18 ? "Esti major" : "Esti minor");

}
}