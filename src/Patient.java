/**
 * Created by Xileus on 15/03/2015.
 */
public class Patient {private String name;private int age;private double height, weight;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(double height, double weight) {
        this.height = height; this.weight = weight;
    }
    public int getAge(){return age;}public String getName(){return name;}public double getBMI(){return (weight/(height * height));}

}
