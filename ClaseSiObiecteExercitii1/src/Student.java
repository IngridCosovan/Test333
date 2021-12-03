public class Student {
    String name;
    int age;
    String telephoneNumber;

    //sau definim un constructor care sa primeasca 2 parametrii.

    public Student(String name, int age, String telephoneNumber) {
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
    }

    public void call(String telephoneNumber) {
        System.out.println("Studentul " + name + " avand numarul de telefon " + this.telephoneNumber + " a facut un call catre numarul de telefon " + telephoneNumber);
    }

}
