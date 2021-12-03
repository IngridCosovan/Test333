import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Telefon telefonSamsung = new Telefon("Samsung", "S9", 4, 999.99);

        Telefon telefonIphone = new Telefon("Iphone", "12", 8, 3999.99);

        Telefon telefonIncomplet = new Telefon("Samsung" , "A21s");

        Telefon telefonIncomplet2 = new Telefon ("Samsung", "A21s", 12);



        System.out.println(telefonSamsung); // printare telefoane, numele clasei si hashtagul codului
        System.out.println(telefonIphone);
        System.out.println(telefonIncomplet);
        System.out.println(telefonIncomplet2);


      /*  telefonSamsung.suna();
        telefonIphone.suna();
        telefonIncomplet.suna();
        telefonIncomplet2.suna();*/

        //SAU

        ArrayList<Telefon>telefoane = new ArrayList<>(Arrays.asList(telefonIncomplet, telefonIncomplet2));
        telefoane.add(telefonSamsung);
        telefoane.add(telefonIphone);


        for (Telefon telefon :  telefoane){
            telefon.suna();
        }
    }
}
