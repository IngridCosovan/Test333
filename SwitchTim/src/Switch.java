import java.util.Locale;

public class Switch {
    public static void main(String[] args) {
    /*    int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }*/
      /*  int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }*/

        //More code here

        //Exercise: Create a new switch statement usi char instead of int. Create a new char variable. Create a statement
        //testing for: A, b, C, D or E. Disply a message if any of there are found and then break. Add a default which
        // displays a message saying not found
/*
        char charValue = 'F';
        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value is " + charValue);
                break;
            default:
                System.out.println("Not found");
                break;

        }*/


        String month = "JaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case" june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");

                // daca faceam .toUpperCase() atunci toate valorile din case trebuiau sa fie scrise cu litere mari.
        }
    }
}
