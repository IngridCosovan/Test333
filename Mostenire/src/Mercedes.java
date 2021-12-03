public class Mercedes extends Car{


    boolean autopilot;

    public Mercedes(String marca, String model) {
        super(marca, model);
        System.out.println("Un mercedes a fost generat");
    }


    public void accelerate(){
        System.out.println("Mercedes is accelerating");

    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", autopilot=" + autopilot +
                '}';
    }
}
