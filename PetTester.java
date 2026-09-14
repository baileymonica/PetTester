import java.util.Scanner;
public class PetTester {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // 2nd Pet
        Pet pet2 = new Pet("Dog", "Esteban", 5);
        System.out.println(pet2);

        // Scanner object for the users input
        Scanner scanner = new Scanner(System.in);

        // 3rd pet object for users input
        System.out.println("Enter animal type: ");
        String inputType = scanner.nextLine();

        System.out.println("Enter animal name:");
        String inputName = scanner.nextLine();

        System.out.println("Enter animal age: ");
        int inputAge = scanner.nextInt();

        Pet pet3 = new Pet(inputType, inputName, inputAge);
        System.out.println();
        System.out.println(pet3);

        scanner.close();
    }
}
