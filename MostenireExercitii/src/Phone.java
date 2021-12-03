public class Phone {
    String number;
    int price;


    public Phone(String number, int price) {
        this.price = price;
        this.number = number;
    }

    public void call(){
            System.out.println(number + " made a call.");
        }

        public void showDetails(){
            System.out.println("Telefon: " + number + " ,price: " + price);
        }
    }

