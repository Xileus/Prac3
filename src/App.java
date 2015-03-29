import java.util.Scanner;

/**
 * Created by Xileus on 15/03/2015.
 */
public class App {
    public static void main(String[] args) {
        Patients patients = new Patients(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMI Manager");
        System.out.println("Please select from the following menu options:\n\t1. Add new patient\n\t2. View patient\n\t3. Exit");
        aboutTime:
        while (true) {
            System.out.printf("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    if (patients.isFull()) {
                        System.out.println("\"Database\" is full... And by \"Database\" I mean array");
                    } else {
                        patients.add(createPatient(scanner));
                    }
                    break;
                }
                case 2:
                    if (patients.count() == 0) {
                        System.out.println("There's nothing in the \"Database\"");
                    } else {
                        viewPatients(patients);
                    }
                    break;
                case 3: {
                    System.out.println("Good riddance");
                    break aboutTime;
                }
            }
        }
    }

    private static void viewPatients(Patients patients) {
        for (int i = 0; i < patients.count(); i++) {
            Patient patient = patients.get(i);
            System.out.println(String.format("Name: %s Age: %d BMI: %.2f", patient.getName(), patient.getAge(), patient.getBMI()));
        }
    }

    public static Patient createPatient(Scanner scanner) {
        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter fatness, erhm, I mean weight:");
        double weight = scanner.nextDouble();

        System.out.println("Enter height:");
        double height = scanner.nextDouble();

        return new Patient(name, age, height, weight);
    }
}
