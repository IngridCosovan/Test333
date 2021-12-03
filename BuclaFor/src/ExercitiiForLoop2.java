import java.util.Scanner;

public class ExercitiiForLoop2 {
    public static void main(String[] args) {

        // 1. Scrieti un pg care cere utilizatorului sa introduca un numar de la consola.
        //Daca numarul este par, acesta va fi printat de 10 pri, daca nu, de 20 de ori
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti un numar de la tastatura");
        int numar = sc.nextInt();
        if (numar % 2 == 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numar + "x" + i);
            }
        } else {
            for (int i = 1; i <= 20; i++) {
                System.out.println(numar + "x" + i);
            }
        }*/

        // 2. Programul cere utilizatorului sa introduca un String text, apoi sa introduca un int x.
        // Textul va fi printat la consola de x ori.

      /*  Scanner sc = new Scanner(System.in);
        Scanner scNr = new Scanner(System.in);
        System.out.println("Introduceti text in consola");
        String text = sc.nextLine();
        System.out.println("Introduceti numarul de iteratii in consola");
        int x = scNr.nextInt();

        for (int i=0 ; i<=x; i++){
            System.out.println(text + "x"+i);
        }
*/
        //3. Programul cere utilizatorului sa introduca un String text, apoi sa introduca un int x. Daca numarul
        //este mai mic ca 5, textul se va printa de 10 ori pe linii diferite. Daca nu, de 10 ori pe acelasi rand,
        //cu spatiu intre ele.

     /*   Scanner scText = new Scanner(System.in);
        System.out.println("Introduceti un text");
        String text = scText.nextLine();
        System.out.println("Introduceti un numar");
        Scanner scNr = new Scanner(System.in);
        int x = scNr.nextInt();

        if (x<5){
            for (int i=1; i<=10; i++){
                System.out.println(text);
            }
            }else {
            for (int i=1; i<=10; i++) {
                System.out.print(text + " ");

            }
        }*/

        //4.Scrieti nun pg care sa ceara utilizatorului ora curenta. Sa se printeze la consola timpul din 15
        // in 15 minute de la ora 0 pana la ora introdusa. Model : 00:00, 00:15, 00:30, 00:45, 01:00, 01:15, __ nn:00

        /*Scanner scOra = new Scanner(System.in);
        System.out.println("Scrieti ora curenta.");
        int oraCurenta = scOra.nextInt();
        if (oraCurenta<=24 && oraCurenta>=0){
        for (int i = 0; i < oraCurenta; i++) {
            if (i < 10) {


                System.out.println("0"+i + ":00");
                System.out.println("0"+i + ":15");
                System.out.println("0"+i + ":30");
                System.out.println("0"+i + ":45");
            }else {
                System.out.println(i + ":00");
                System.out.println(i + ":15");
                System.out.println(i + ":30");
                System.out.println(i + ":45");
            }
            }
        }else{
                System.out.println("Nu ati introdus o ora valabila");
            }*/


        //5. Scrie un pg, care citeste un numar int n de la user, apoi citeste n numere de la user si la
        // sfarsit afiseaza numarul cel mai mic

        Scanner sc = new Scanner(System.in);
        int minim = Integer.MAX_VALUE;
        System.out.println("Scrieti numarul de citiri");
        int numarCitiri = sc.nextInt();
        for (int i=1; i<=numarCitiri; i++){
            System.out.println("Introduceti numarul " + i);
            int numar = sc.nextInt();
            if (numar<minim){
                minim=numar;
            }
        }
        System.out.println("Cel mai mic numar este" + minim);
    }
}
