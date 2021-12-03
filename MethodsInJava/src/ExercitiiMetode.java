import java.util.Scanner;

public class ExercitiiMetode {
    public static void main(String[] args) {
/* salut("Raluca");
 salut("Gabi");
 salut("Andrei");*/

/*
        compara(5, 3);
        compara(875, 4);
        compara(454, 6565);
        compara(65, 65);*/

     /*   estePozitiv(5);
        estePozitiv(-7783);*/

       /* printare("Este interesant sa inveti Java.");*/

        printare2("Java", 7);
        printare2("Phyton", 56);
    }

    public static void salut (String nume){
        System.out.println("Salut, ma numesc " + nume + ".");
    }

    public static void compara(int n1, int n2){
        if (n1>n2){
        System.out.println("Primul numar " + n1 + " este mai mare");
        }else if(n1<n2){
            System.out.println("Al doilea numar " +n2 + " este mai mare");
        }else{
            System.out.println("Numerele sunt egale");
        }
    }

    public static void estePozitiv(int numar){
        System.out.println(numar>=0 ? "Numarul este pozitiv" : "Numarul este negativ");
    }


    public static void printare(String text){
        for (int i=1; i<=10; i++) {
            System.out.println(text + " x"+i);
        }
    }

    public static void printare2(String text2, int numar){
for (int i=1; i<=numar; i++){
    System.out.println(text2 + " x" + i);
}
    }
}
