import java.util.Scanner;

public class ExercitiiForLoop3 {
    public static void main(String[] args) {

        //1. Scrieti un program care calculeza si printeaza suma tuturor numerelor de la 1 la 50.
      /*  int suma = 0;

        for (int i=1; i<=50; i++) {
            suma+=i;
        }
        System.out.println("Suma numerelor de la 1 la 50 este = " +suma);*/

        //2. Scrieti un program care calculeza si printeaza suma tuturor numerelor impare cuprinde intre  0 si 100.
     /*   int suma = 0;
        for (int i=1; i<=100; i++){
            if(i%2 != 0){
                suma+=i;
            }

        }
        System.out.println("Suma numerelor impare cuprinsa intre 0 si 100 este egalacu "+suma );*/

        //sau
        /*int suma = 0;
        for (int i=1; i<=100; i+=2){
            suma+=i;
        }

        System.out.println("Suma numerelor impare cuprinsa intre 0 si 100 este egalacu "+suma );
*/
        //3. Scrieti un program care calculeza media aritmetica a tuturor numerelor de la 10 la 100.
      /*  int suma = 0;
        int totalNumere = 0;
        for (int i = 10; i <= 100; i++){
            suma+=i;
            totalNumere++;
        }
        int medie = suma / totalNumere;
        System.out.println("Media aritmetica a tuturor numerelor de la 10 la 100 este egala cu " + medie);*/


        //4. Scrieti un program care calculeza suma si produsul numerelor cuprinse intre -5 si 5.
      /*  int suma = 0;
        int produs = 0;
        for (int i = -5; i <= 5; i++) {
            suma += i;
            produs *= i;
        }
        System.out.println("Suma numerelor este " + suma + " si produsul numerelor este " + produs);*/


        //5. Programul va cere user-ului sa introduca un numar de la tastatura.
        //Daca numarul este pozitiv, sa se calculeze produsul numerelor pare de la 0 la acel numar.
        //Daca numarul este negativ, sa se calculeze suma numerelor impare de la 0 la acel numar.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numar");
        int numar = sc.nextInt();
        if (numar>0) {
            int produs = 0;
            for (int i = 0; i <= numar; i += 2) {
            produs += i;
            }
        }
            System.out.println("Calcul nr pare de la 0 pana la numarul ales " + produs);
        }else if (numar%2 != 0) {
            int suma = 0;
            for (int i=0; i<=numar; i++) {
            produs += i;}
                System.out.println("Calcul nr impare de la 0 pana la numarul ales " + suma);

        }
    }
}
