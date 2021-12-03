import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercitiiSwitch2 {
    public static void main(String[] args) {
        //1. Scrieti un program care cere utilizatorului sa introduca clasa in care e si se afiseaza mesaj corespunzator:
        //1-4: Primara
        //5-8: Generala
        //9-12: Liceu
        //Daca utilizatorul introduce un alt numar, se va afisa un mesaj corespunzator.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("In ce clasa esti?");
        int clasa = sc.nextInt();

        switch (clasa) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Pirmara");
                break;

            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("Generala");
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Liceu");

            default:
                System.out.println("Ai introdus un numar invalid");
        }*/


        //2. Declarati o variabila String manaOponentului cu valoare "piatra".
        //Programul va cere utilizatorului sa introduca "piatra", "foarfeca" sau "hartie".
        //in functie de ce introduce utilizatorul, afisati un mesaj corespunzator: Ai castigat/Remiza/Ai pierdut

      /*  String manaOponentului = "piatra";
        Scanner sc = new Scanner(System.in);
        System.out.println("Piatra, foarfeca, sau hartie?");
        String manaMea = sc.nextLine();

        switch (manaMea) {
            case "piatra":
                System.out.println("Remiza");
                break;
            case "foarfeca":
                System.out.println("Ai pierdut");
                break;
            case "hartie":
                System.out.println("Ai castigat");
                break;
            default:
                System.out.println("Nu ai introdus ceva valid");
        }*/

        //3. Scrieti un program care va cere utilizatorului limbajul de programare preferat:
        //Daca introduce "java", pg va afisa "Cel mai frumos limbaj de programare"
        //Daca introduce "C#", pg va afisa "Un limbaj bun"
        //Daca introduce "PHP", pg va afisa "Hmm.."
        //Daca introduce altceva, pg. va afisa "Nu cunosc acest limbaj.

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Care este limbajul tau de programare preferat?");
        String limbaj = sc.nextLine();

        switch (limbaj){
            case "java":
                System.out.println("Cel mai frumos limbaj de programare");
                break;

            case "C#":
                System.out.println("Un limbaj bun");
                break;

            case "PHP":
                System.out.println("Hmm..");
                break;

            default:
                System.out.println("Nu cunosc acest limbaj.");
        }*/


        //4.Scrieti un program care cere utilizatorului o litera si printeaza o VOCALA, daca caracterul e vocala.
        //CONSOANA daca caracterul este consoana si NUMAR daca caracterul este numeric.
        //In caz contrar se va printa CARACTER SPECIAL

        Scanner sc = new Scanner(System.in);
        System.out.println("Scrieti un caracter");
        char c = sc.next().charAt(0);
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("VOCALA");
                break;

            case '!':
            case '@':
            case '#':
            case '$':
            case '%':
            case '^':
            case '&':
            case '*':
            case '(':
            case ')':
            case '-':
                System.out.println("Caracter special");
                break;
            default:
                System.out.println("CONSOANA");


        }



        //5. Scrieti un pg care cere utilizatorului ora actuala.
        //Pentru fiecare ora/interaval orar, afisati un mesaj corespunzator programului vostru zilnic

    }
}
