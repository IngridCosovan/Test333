public class Elev {

    static String profesor = "Ingrid Cosovan";



    String nume;
    int varsta;


    public Elev(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;

    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", profesor=" + profesor +
                '}';

        //Fieldurile si metodele non statice nu pot fi apelate in metode statice.
        //Putem vedeaa in schimb ca fieldurile/metodele statice (profesor) pot fi apelate in contexte non statice (toString())
    }
}
