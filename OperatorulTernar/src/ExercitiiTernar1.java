import java.util.Scanner;

public class ExercitiiTernar1 {
    public static void main(String[] args) {

        //1. Cititi de la tastatura un numar. Daca numarul este negativ, printati un mesaj corespunzator.
        //La fel daca este pozitiv
        //Pg. trebuie sa aiba doar 3 linii de cod.
/*
        Scanner sc = new Scanner(System. in);
        int numar = sc.nextInt();
        System.out.println(numar>=0 ? "Numar pozitiv" : "Numar negativ");*/


        //2. Declarati o variabila de tip boolean suntInsetat si intializa-ti-o prin citirea valorii de la tastatura.
        //Pe baza lui se vor printa 2 mesaje posibile: "Bea niste apa" sau "Nu mai bea atunci".Folositi ternary if.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Iti este sete? Introdu true sau false");
        boolean suntInsetat = sc.nextBoolean();
        System.out.println(suntInsetat ? "Bea niste apa" :  "Nu mai bea atunci");
        */

        //3. Declarati 2 variabile de tip int si intializati-le prin citrea lor de la tastatura.
        //Daca primul numar este mai mare, printati un mesaj corespunzator. In caz contrar, printati "primul numar nu este mai mare"
        //Pg trebui sa aiba loc in 4 linii de cos


     /*   Scanner sc = new Scanner(System.in);
        int numar1 = sc.nextInt();
        int numar2 = sc.nextInt();
        System.out.println(numar1>numar2 ? "Primul numar este mai mare" : "Primul numar nu este mai mare");*/

        //4. Declarati 2 variabile de tip int si intializati-le. Userul va introduce un numar de la tastatura.
        //Daca numarul introdus este mai mare decat cele 2 numere. se va afisa un mesaj corespunzator. La fel si daca nu+
        //Folositi ternary if
       /* int nr1 = 100;
        int nr2 = 200;
        Scanner sc = new Scanner(System.in);
        int numarIntrodus = sc.nextInt();

        System.out.println(numarIntrodus>nr1 && numarIntrodus>nr2 ? "Numarul introdus este mai mare decat cele 2 numere" : "Numarul introdus este mai mic decat cele 2 numere");
*/
        //5. Scrieti un pg care cere utilizatorului sa isi introduca media anuala.
        //Daca media anuala este mare ca 5, printati "Vei trece anul". in caz contrar, "Vei repeta anul".
        //Folositi ternary if

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti media d-voastra");
        int medie = sc.nextInt();
        System.out.println(medie>5 ? "Vei trece anul" : "Vei repeta anul");


    }
}
