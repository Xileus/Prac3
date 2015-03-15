import java.util.Scanner;

/**
 * Created by Xileus on 15/03/2015.
 */
public class App {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMI Manager");
        System.out.println("Please select from the following menu options:\n\t1. Add new patient\n\t2. View patient\n\t3. Exit");
        aboutTime:while (true){
        System.out.printf("Enter choice: ");
        int choice = scanner.nextInt();
        switch (choice){case 1:{System.out.println("Name:");String name = scanner.next();System.out.println("Age");int age = scanner.nextInt();System.out.println("Fatness, erhm, Weight");double weight = scanner.nextDouble();System.out.println("Height");double height = scanner.nextDouble();patient.setName(name);patient.setAge(age);patient.setDetails(height,weight);break;}case 2:System.out.println(String.format("Name: %s Age: %d BMI: %.2f", patient.getName(), patient.getAge(), patient.getBMI()));break;case 3:{System.out.println("Good riddance");break aboutTime;}}
    }}
}
