import javax.security.auth.DestroyFailedException;
import java.util.Scanner;

public class ExercitiiSwitch1 {
    public static void main(String[] args) {
        //1. Introduceti un numar de la tastatura cuprins intre 1 si 9. Sa se printeze pentru fiecare numar introuds
        //numele lui de tip text: Pentru 1 printati "unu" samd.
   /*     Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 9");
        int numar = sc.nextInt();

        switch (numar) {
            case 1:
                System.out.println("unu");
                break;
            case 2:
                System.out.println("doi");
                break;
            case 3:
                System.out.println("trei");
                break;
            case 4:
                System.out.println("patru");
                break;
            case 5:
                System.out.println("cinci");
                break;
            case 6:
                System.out.println("sase");
                break;
            case 7:
                System.out.println("sapte");
                break;
            case 8:
                System.out.println("opt");
                break;
            case 9:
                System.out.println("noua");
                break;
            default:
                System.out.println("Ati introudus un numar invalid");
        }*/

        //2. Scrieti un program care cere utilizatorului nota obtinuta la matematica si afiseaza mesajele corepunzatoare:
        //1-4: Ai picat.
        //5-6: Mai ai de munca
        //7-9: Bravo
        //10: Felicitari -Folositi SWITCH
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrieti va rog nota obtinuta la matematica");
        int nota = sc.nextInt();
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Ai picat");
                break;

            case 5:
            case 6:
                System.out.println("Mai ai de munca");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Bravo");
                break;

            case 10:
                System.out.println("Felicitari");
                break;

            default:
                System.out.println("Ai trecut o nota invalida");
        }*/

        //3. Scrieti un program care cere utilizatoruli ziua actuala si afisati mesaje corespunzatoare.
        //Daca este zi lucratoare, "Spor la munca", daca nu, "Odihna placuta".

    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Ce zi este astazi?");
        String zi = sc.nextLine();

        switch (zi){
            case "luni":
            case "marti":
            case "miercuri":
            case "joi":
            case "vineri":
                System.out.println("Spor la munca!");
                break;
            case "sambata":
            case "duminica":
                System.out.println("Odihna placuta!");
                break;
            default:
                System.out.println("Nu ati introdus o zi valida");

        }
*/
        //4. Scrieti un program care intreaba utilizatorul care se descurca in acest curs.
        //Daca se introuduce "foarte bine", computerul va afisa "<3".
        //Daca se introuduce "bine", computerul va afisa "Ma bucur".
        //Daca se introuduce "slab", computerul va afisa "Hai sa refacem exercitiile de la inceput.".
        //Daca se introuduce "nu inteleg nimic", computerul va afisa "Minti!".
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Cum te descurci la acest curs?");
        String nivel = sc.nextLine();

        switch (nivel){

            case "foarte bine":
                System.out.println("<3");
                break;
            case "bine":
                System.out.println("Ma bucur");
                break;
            case "slab":
                System.out.println("Hai sa refacem exercitiile de la inceput.");
                break;
            case "nu inteleg nimic":
                System.out.println("Minti!");
                break;
            default:
                System.out.println("Nu ati introdus un cuvand valabil");
        }*/

//5. Scrie un porgram care sa intrebe ce destinatie de vacanta prefera: mare, munte sau la  tara.
        //Pentru fiecare caz programul va printa niste locuri corespunzatoare interesante.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ce destinatie de vacanta preferi?");
        String destinatie = sc.nextLine();

        switch (destinatie){
            case " mare":
                System.out.println("Vama veche, Halkidiki Ayia Napa");
                break;

            case "munte":
                System.out.println("Bucegi, Durau, Hymalaya");
                break;

            case "tara":
                System.out.println("Ilisesti, Mihai Viteazu, Gura Humorului");
                break;
            default:
                System.out.println("nu ati introdus o varianta corecta");
        }
    }
}
