import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cal cal = new Cal();
        int mass, acceleration;
        String strMass, strAcceleration;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the mass?");
        strMass = scanner.nextLine();
        mass = Integer.parseInt(strMass);
        cal.setMass(mass);

        System.out.println("What is the acceleration?");
        strAcceleration =  scanner.nextLine();
        acceleration = Integer.parseInt(strAcceleration);
        cal.setAcceleration(acceleration);

        System.out.println("This is the force: " + cal.computeForce());
    }
}
