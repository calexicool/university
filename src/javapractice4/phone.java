package javapractice4;

public class phone {
    private long number;

    private String model;

    private   double weight;
    private String name;

    public phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new phone(324234,"Круто");
    }

    @Override
    public String toString() {
        return "phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String receiveCall(){
        return this.name;
    }

    public phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public phone() {
    }
}
