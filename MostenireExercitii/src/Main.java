import java.rmi.server.RemoteObject;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("0230675897", 400);
        phone.call();
        phone.showDetails();

        Cellular cellular = new Cellular("0754750403", 1000);
        cellular.call();
        cellular.showDetails();
        cellular.playVideo();
        cellular.takePicture();

        SmartPhone smartphone = new SmartPhone("0754750455", 1200);
        smartphone.playVideo();
        smartphone.call();
        smartphone.takePicture();
        smartphone.showDetails();
        smartphone.takeScreenshot();

        DeskPhone deskphone = new DeskPhone("2056750403", 1400);
        deskphone.call();
        deskphone.showDetails();

        Samsung samsung = new Samsung("4316750677", 6000);
        samsung.playVideo();
        samsung.call();
        samsung.takePicture();
        samsung.showDetails();
        samsung.takeScreenshot();

        Iphone iphone = new Iphone("2056750488", 14060);
        iphone.playVideo();
        iphone.call();
        iphone.takePicture();
        iphone.showDetails();
        iphone.takeScreenshot();

        Mottorola mottorola = new Mottorola("2056750422", 13400, false);
        mottorola.call();
        mottorola.showDetails();
        mottorola.playVideo();
        mottorola.takePicture();
        mottorola.closeClap();
        mottorola.closeClap();
        mottorola.closeClap();
        mottorola.closeClap();
        mottorola.closeClap();
        mottorola.closeClap();



        Nokia nokia = new Nokia("2056750411", 12400);
        nokia.call();
        nokia.showDetails();
        nokia.playVideo();
        nokia.takePicture();

        Panasonic panasonic = new Panasonic("20567504799", 19400);
        panasonic.call();
        panasonic.showDetails();
        panasonic.playPolytone();


        Cisco cisco = new Cisco("2056750567", 14060);
        cisco.call();
        cisco.showDetails();
        cisco.sendFax();

    }

    /*
    1. Scrieti o superclasa Phone care sa fie mostenita de urmatoarele clase: Smarphone, Cellular si DeskPhone

    2. Scrieti in clasa Phone 2 campuri comune price si number si metodele call(() si showDetails().
    Acestea din urma sa afiseze la consola detalii depsre telefon, folosind campurile.

    3. Scrieti ate alte 2 clase carre sa mosteneasca copiii clase Phone: Samsung, Iphone, Nokia, Mottorola, Panasonic si Cisco

      4. Scrieti toate metodele urmatoare in clasele corespunzatoare: takeScreenshot(), takePictures(), playVideo(),
      closeClap(), playPolytone(), sendFax, si totodata mosteniti si din clasele de mai sus. Observati ce puteti mosteni si de unde.*/
}
