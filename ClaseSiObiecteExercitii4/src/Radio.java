import java.util.ArrayList;
import java.util.Arrays;

public class Radio {

    /*1. Creati clasa Radio, cu umratoarele field-uir: boolean on, int volum, int currentPostIndex si ArrayList<String> posts
     * In momentul crearii unui radio se vor adauga 5 posturi in lista de posts a acestuia.
     * Orice radio initializat va avea prima data postul curent 1, volumul 0 si va fi oprit.
     * Radioul va avea urmatoarele functionalitati:
     * turnOn(), turnOff() - aceste metode vor opri si porni radioul
     * turnVolumeUp(), turnVolumDown()-aceste metode vor modifica volumul radioului. Un radio poate avea volum cuprins intre 0 si 10.
     * changePostForward(), changePostBacwards()-aceste metode vor modifica postul curent, pe baza listei de posturi din structura acestuia.
     * displayRadioStatus()-aceasta metoda va primi unul dintre urmatoarele mesaje in functie de structura intrna a radioului curent:
     * "Radioul este orpit"/"Radioul este pepostul x, dat la volumul y".
     * Creati un obiect de tip Radio, Schimbati de 5 ori volumul si de 10 ori postul curent(forward s backward.), printand de asemeena de ficare
     * data structura interna a radioului*/

    boolean on;
    int volume;
    int currentPostIndex;
    ArrayList<String> posts;

    public Radio() {
      currentPostIndex=1;
      posts = new ArrayList<>(Arrays.asList("MagicFM", "RadioZU", "Nicecream"));
      posts.add("Rock FM");
      posts.add("Guerilla");
    }

    public void turnOn() {
if(on){
    System.out.println("Radioul este deja pornit");
}else{
    System.out.println("Am pornti radioul");
    on=true;
}
    }

    public void turnOff() {
if(on){
    System.out.println("Radioul este deja pornit");
    on=false;
}else{
    System.out.println("Radioul este de oprit");
}
    }

    public void turnVolumeUp() {
if(volume ==10){
    System.out.println("Radioul este dat la volum maxim");
}else{
    volume++;
    System.out.println("Am schimbat volumul pe treapta " + volume);
    displayRadioStatus();
}
    }

    public void turnVolumeDown() {
        if(volume == 0){
            System.out.println("Radioul este deja pe mute");
        }else{
            volume--;
            System.out.println("Am schimbat volumul pe treapta " + volume);
            displayRadioStatus();
        }

    }

    public void changePostForward(){
if (currentPostIndex == posts.size()-1){
    currentPostIndex=0;
        }else{
    currentPostIndex++;
    displayRadioStatus();
        }
    }

    public void changePostBackwards() {
        if (currentPostIndex==0){
            currentPostIndex=posts.size()-1;
        }else{
            currentPostIndex--;
            displayRadioStatus();
        }
    }


    public void displayRadioStatus() {
if(!on){
    System.out.println("Radioul este oprit");
}else {
    System.out.println("Radioul este pe postul " + posts.get(currentPostIndex)+ " dat la volumul " + volume);
}
    }

}
