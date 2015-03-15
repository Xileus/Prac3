import java.util.Scanner;

/**
 * Created by Xileus on 15/03/2015.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMI Manager");
        System.out.println("Please select from the following menu options:\n\t1. Add new patient\n\t2. View patient\n\t3. Exit");
        aboutTime:while (true){
        System.out.printf("Enter choice: ");
        int choice = scanner.nextInt();
        switch (choice){case 1:{break;}case 2:{break;}case 3:{System.out.println("Good riddance");break aboutTime;}}
    }}
}
