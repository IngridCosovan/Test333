public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", 22, "0745336606");

/*student1.name="John";
student1.age=22;*/
        student1.call("0745336601");
        student1.call("0722344444");


        Employee employee1 = new Employee("Robert", 1994, "64C - Wall Street", 10000);
        Employee employee2 = new Employee("Sam", 2000, "68D - Wallstreet", 5604);
        Employee employee3 = new Employee("John", 1999, "26B - Wallstreet", 5733);

        employee1.showDetails();
        employee2.showDetails();
        employee3.showDetails();
        /*
1. Creati o clasa numita Student cu variabila String name si variabile int age.
Alocati valoarea age cu 22 si cea a numelui cu John prin crearea unui obiect al clasei Student


/* 2. Modificati clasa Student, adaugand un field String telephoneNumber. Creati metoda call, care va primi
ca parametru un String.
Metoda va afisa urmatorul text: "Studentul X avand numarul de telefon Y a facut un call catre numarul de telefon Z"
* */
/* 3.Scrieti un pg care sa afiseze informatiile (numele, anul inscrierii, salariul, adresa) a trei angajati prin crearea
unei clase Employee. Afisarea trebuie sa fie urmatoarea:

Name      Year of joining    Address
Robert    1994               64C - Wallstreet
Sam       2000               68D - Wallstreet
John      1999               26B - Wallstreet



        */
    }
}
