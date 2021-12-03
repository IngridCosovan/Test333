public class Employee {

    String name;
    int yearOfJoining;
    String address;
    double salary;

    public Employee(String name, int yearOfJoining, String address, double salary) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
        this.salary = salary;


    }

    //Pentru a avea acea forma ne vom defini o metoda, cea de mai jos
    public void showDetails() {
        System.out.println(name + " " + yearOfJoining + " " + address + " " + salary);
    }
}
