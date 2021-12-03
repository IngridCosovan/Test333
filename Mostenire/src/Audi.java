public class Audi extends Car {

    public Audi(String marca, String model) {
        super(marca, model);
        System.out.println("Am generat un audi.");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
