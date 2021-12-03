public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();

//apelarea metodelor

        radio.turnOn();
        radio.turnVolumeUp();
        radio.changePostForward();
        radio.changePostBackwards();
        radio.changePostBackwards();
        radio.changePostBackwards();
        radio.changePostBackwards();

        Pencil pencil = new Pencil("albastru");
        pencil.write("Bun venit la Bosch");
        System.out.println(pencil.remainingInk);
    }
}
