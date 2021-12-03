import java.util.Scanner;


// Swtich - utilizata cand avem un un nr de otptiuni si trebuie sa efectuam o sarcina diferita pentru fiecare alegere
// o folosim cand dorim ca informatia sa fie comparata cu diverse valori, iar pentru fiecare sa se execute un anumit bloc de cod
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti culoarea semaforului");
        String culoareSemafor = sc.nextLine();

        switch(culoareSemafor){
            case "rosu" :
                System.out.println("Stam si asteptam.");
                break;
            case "verde" :
                System.out.println("Traversam.");
                break;
            case "galben" :
                System.out.println("Asteptam.");
                System.out.println("Better safe, than sorry.");
                break;
            default:
                System.out.println("Nu ai introdus o culoare valabila");
        }
    }
}
