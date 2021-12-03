import java.util.Scanner;

public class ExercitiiTernar2 {
    public static void main(String[] args) {
        //1. Declarati 2 variabile de tip double si initializati-le prin citirea lor de la consola.
        //Daca suma lor este mai > decat 100, printati un mesaj corespunzator. la fel si daca nu este. Folositi ternary if


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        double numar1= sc.nextDouble();
        System.out.println("introduceti numar2");
        double numar2 = sc.nextDouble();
        System.out.println((numar1 + numar2) > 100 ? "Suma este mai mare ca 100" : "Suma este mai mica ca 100");*/


        //2.Scrieti un program care cere userului sa introduca 3 numere. Daca media lor aritmetica este mai > decat 50 ,
        // sa se afiseze un mesaj corespunzator. la fel si daca nu este. Folositi ternary if.
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        int numar1 = sc.nextInt();
        System.out.println("Introduceti al doilea numar");
        int numar2 = sc.nextInt();
        System.out.println("Introduceti al treilea numar");
        int numar3 = sc.nextInt();

        //Se mai poate si cu o medie aritmetica facuta inainte int medieAritmetica
        System.out.println(((numar1 + numar2 + numar3) / 3)>50 ? "Media artimetica este mai mare ca 50" : "Media artimetica este mai mica ca 50");*/

        //3. Scrieti un pg. care sa ceara utilizatorului numar de ore lucrate intr-o zi. Daca utilizatorul a lucrat minim 8 ore
        //se va afisa "Ne vedem maine", daca nu "Programul nu a fost incheiat".
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate ore lucrezi pe zi?");
        int ore = sc.nextInt();
        System.out.println(ore>=8 ? "Ne vedem maine" : "Programul nu a fost incheiat");*/


        //4. Declarati o variabila de tip boolean amEnergie si intializati-o prin citirea ei de la tastatura.
        //Pg va cere utilizatorului sa introduca luna curenta
        //Pt fiecare anotimp se va printa un mesaj corespunzator. Daca utilizatorul are energie se va printa o activitate specifica
        //anotimpului. Daca nu, va ramane acasa si se va odihni.
/*

        Scanner sc = new Scanner(System.in);
        Scanner scText = new Scanner(System.in);
        System.out.println("Aveti energie?");
        boolean amEnergie = sc.nextBoolean();
        System.out.println("Introduceti luna curenta");
        String lunaCurenta = scText.nextLine();
        switch (lunaCurenta){
            case "decembrie":
            case "ianuarie":
            case "februarie":
                System.out.println(amEnergie ? "Ne batem cu zapada" : "Ne odihnim");
                break;
            case "martie":
            case "aprilie":
            case "mai":
                System.out.println(amEnergie ? "Ne plimbam in parc" : "Ne odihnim");
                break;
            case "iunie":
            case "iulie":
            case "august":
                System.out.println(amEnergie ? "Mergem la mare" : "Ne odihnim");
                break;
            case "septembrie":
            case "octombrie":
            case "noiembrie":
                System.out.println(amEnergie ? "Culegem frunze" : "Ne odihnim");
                break;
            default:
                System.out.println("Nu ai introdus o luna valida");
        }
*/


        //5. Un magazin online are 4 produse: ps5(pret 2000), xbox(pret 500), pc(pret 2000) si laptop(pret 1500).
        //Utilizatorul are un buget de 1700 de lei. Programul va intreba utilizatorul ce anume doreste sa cumpere.
        //Daca nu are suficienti bani, utilizatorul va cumpara cu succes produsul respectiv. Daca nu se va afisa mesajul corespunzator.
       /* int ps5 = 2000;
        int xBox = 500;
        int pc = 2000;
        int laptop = 1500;
        int buget = 1700;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ce anume doresti sa cumperi?");
        String produs = sc.nextLine();

        switch (produs){
            case "ps5":
                System.out.println(buget>ps5 ? "Utilizatorul va cumpara ps5-ul" : "Utilizatorul nu isi permite ps5-ul");
                break;
            case" xBox":
                System.out.println(buget>xBox ? "Utilizatorul va cumpara xBox-ul" : "Utilizatorul nu isi permite xBox-ul");
                break;
            case "pc":
                System.out.println(buget>pc ? "Utilizatorul va cumpara pc-ul" : "Utilizatorul nu isi permite pc-ul");
                break;
            case "laptop":
                System.out.println(buget>laptop ? "Utilizatorul va cumpara laptop-ul" : "Utilizatorul nu isi permite laptop-ul");
                break;
            default:
                System.out.println("nu avem acest produs");

        }*/




    }

}
