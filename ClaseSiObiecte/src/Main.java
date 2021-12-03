public class Main {

    //vom introduce metoda psvm

    public static void main(String[] args) {

        Car masina1 = new Car();

        //starea definita de campuri
        //comportamentul definit de metode.


        //Dam valori proprietatilor masinii noatre

        masina1.nume="Audi";
        masina1.anFabricatie=2010;


        System.out.println("Masina mea este de marca " + masina1.nume);

        masina1.nume="Dacia";
        System.out.println("Masina mea este de marca " + masina1.nume);

        masina1.startEngine();
        masina1.stopEngine();


        Car masina2 = new Car();
        masina2.nume="BMW";
        masina2.anFabricatie=2020;

        System.out.println("Masina 2 este de marca " + masina2.nume + ", an fabricatie " +masina2.anFabricatie);
        masina2.startEngine();
        masina2.stopEngine();

    }


}
