public class Main {
    public static void main(String[] args) {


        Elev elev1 = new Elev("Marius", 17);

        System.out.println(elev1);

        Elev elev2 = new Elev("Dan", 18);
        System.out.println(elev2);


        Elev.profesor = "Mihai Petrean";

        Elev elev3 = new Elev("Ana", 16);
        System.out.println(elev3);
        System.out.println(elev1);
    }
}
