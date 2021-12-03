public class Telefon {
    String marca;
    String model;                    //campuri, care reprezinta starea obiectelor
    int memorieRam;
    double pret;


    public Telefon(String marca, String model) {
        System.out.println("Un telefon a fost general de marca " + marca); //constructor, modalitatea de instantiere a obiectelor
        this.marca = marca;
        this.model = model;
    }

    public Telefon(String marca, String model, int memorieRam) { //constructor
        this(marca, model);
        this.memorieRam = memorieRam;
    }

    public Telefon(String marca, String model, int memorieRam, double pret) { //double pretulTelefonului//constructor, parametru-double
        this(marca, model, memorieRam);
        this.pret = pret;

        //pret=pretulTelefonului; // daca se trece numele parametrului asteptat in constructor diferit fata de numele campului
        //in care vreau sa bag valoarea respectiva, voi putea trece direct numele, fara this
    }


    //pentru printare efectiva a telefoanelor va trebui sa suprascriu numele codului (se da alt+insert si dupa toString()


public void suna(){
    System.out.println("Telefonul " + marca + " suna"); //metoda
}




    @Override
    public String toString() {                            //metoda, care reprezinta comportamentul obiectelor
        return "Telefon{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", memorieRam=" + memorieRam +
                ", pret=" + pret +
                '}';
    }


}
