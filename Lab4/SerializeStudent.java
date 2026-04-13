package prg4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();

            Student s = new Student(id, name, marks);

            FileOutputStream file = new FileOutputStream("student.dat");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s);
            out.close();
            file.close();

            System.out.println("Student object serialized successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
