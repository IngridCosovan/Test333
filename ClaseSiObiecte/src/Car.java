public class Car {

    String nume;   //campuri - definesc starea obiectelor noastre
    int anFabricatie;


    //functionalitati->

    public void startEngine(){    //metode, care definesc comportamentul
        System.out.println("Masina " + nume + " a pornit.");
    }

    public void stopEngine(){
        System.out.println("Masina " + nume + " s-a oprit.");
    }
}
