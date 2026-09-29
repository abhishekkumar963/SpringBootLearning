import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Abhishek");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student Name: " + students.get(id));
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nAll Students:");

        for (Integer key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

        sc.close();
    }
}