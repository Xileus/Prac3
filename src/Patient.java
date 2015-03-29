/**
 * Created by Xileus on 15/03/2015.
 */
public class Patient {
    private String name;
    private int age;
    private double height, weight;

    Patient(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getBMI() {
        return (weight / (height * height));
    }

}
