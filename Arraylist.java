import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        int i = 0;
        while (i < 10) {
            System.out.print("Enter a family name or 'done' to exit: ");
            name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            System.out.print("Enter an age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            names.add(name);
            ages.add(age);
            i++;
        }
        System.out.println("\nNames and ages:");
        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j) + " - " + ages.get(j));
        }
        int minAge = ages.get(0);
        int maxAge = ages.get(0);
        String youngest = names.get(0);
        String oldest = names.get(0);
        for (int j = 1; j < ages.size(); j++) {
            if (ages.get(j) < minAge) {
                minAge = ages.get(j);
                youngest = names.get(j);
            }
            if (ages.get(j) > maxAge) {
                maxAge = ages.get(j);
                oldest = names.get(j);
            }
        }
        System.out.println("\nYoungest: " + youngest + " (" + minAge + ")");
        System.out.println("Oldest: " + oldest + " (" + maxAge + ")");
     scanner.close();
    }
}
