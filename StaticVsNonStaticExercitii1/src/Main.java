import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        /*
        1.Creati clasa Student . Studentul va avea un int id , si un String name.
Suprascrieti metoda to String pentru a afisa toate detaliile studentului .
Creati 10 studenti , fiecare cu un id unic , care sa fie incrementat in momentul initializarii.

2.Creati clasa Elev, cu fieldurile String name , String grade si static String School.
Fiecare student va avea metoda : printDetails() iar clasa Student va avea metoda changeSchoolName() , care va modifica
numele scolii in care sunt inscrisi toti studentii.
Initializati 10 studenti si adaugati-i intr-o lista.
Printati toti studentii, schimbati numele scolii, dupa care printati-i din nou.

3.Creati clasa T_Shirt, cu urmatoarele proprietati : int size , String color.
Toate tricourile vor avea aceeasi proprietate : brandName. Si metoda changeBrandName ( String newame)
Initializati 3 tricouri, si printati detaliile acestora.
Schimbati numele brandului.
Initializati inca 3 tricouri. Printati detaliile tuturor tricourilor la consola.

4.Creati clasa Person. Fiecare persoana va avea un String first Name si un String lastName.
Gasiti o modalitate ca in orice punct al programului nostru , sa putem afla cate obiecte de tip Person au fost initializate.

         */


//       ex 1:  Student student1 = new Student("Andrei");
//        Student student2 = new Student("Bogdan");
//        Student student3 = new Student("Andreea");
//        Student student4 = new Student("Raluca");
//        Student student5 = new Student("Maria");
//        Student student6 = new Student("Alex");
//        Student student7 = new Student("Mihai");
//        Student student8 = new Student("Ingrid");
//        Student student9 = new Student("Petru");
//        Student student10 = new Student("Aura");
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
//        System.out.println(student5);
//        System.out.println(student6);
//        System.out.println(student7);
//        System.out.println(student8);
//        System.out.println(student9);
//        System.out.println(student10);


        Elev elev1 = new Elev("Mihai1", 10);
        Elev elev2 = new Elev("Mihai2", 7);
        Elev elev3 = new Elev("Mihai3", 10);
        Elev elev4 = new Elev("Mihai4", 9);
        Elev elev5 = new Elev("Mihai5", 5);
        Elev elev6 = new Elev("Mihai6", 7);
        Elev elev7 = new Elev("Mihai7", 10);
        Elev elev8 = new Elev("Mihai8", 3);
        Elev elev9= new Elev("Mihai9", 10);
        Elev elev10 = new Elev("Mihai10", 6);

ArrayList<Elev> elev1 = new ArrayList<>(Arrays.asList(elev1, elev2, elev3, elev4, elev5, elev6, elev7, elev8, elev9, elev10));

    }
}
