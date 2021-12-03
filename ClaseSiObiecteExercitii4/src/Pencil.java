public class Pencil {

    /*2 Creati clasa Pencil cu fieldurile String color, int remainingInk si metoda write(),
    * care va pirmit ca parametru un tip String text.
    * Culoarea pixului va primi ca parametur in constructor, iar orice pix initializat va avea 1000
    * remaining ink.
    * Metoda write va consuma 1 remaining ink pentru fiecare litera/numar primit in parameturl acesteia de tip String.
    * Initializati un pix, iar prin intermediul write, printati la consola tot ce stiti despre clase si obiecte */


    String color;
    int remainingInk;
    String text;

    public Pencil(String color) {
        this.color = color;
        remainingInk=1000;
    }

    public void write(String text){
// varianta 1, dar nu e f buna deoarece va scadea din cerneala si cand sunt pauze, in cazul in care textul
        // este unul cu pauze remainingInk -= text.length();
char[] litere = text.toCharArray();
for(char c:litere){
    if(Character.isDigit(c) || Character.isLetter(c)){
        remainingInk--;
    }
}

        System.out.println(text);
    }



}




