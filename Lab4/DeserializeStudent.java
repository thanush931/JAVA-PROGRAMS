package prg4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("student.dat");
            ObjectInputStream in = new ObjectInputStream(file);

            Student s = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Student object deserialized:");
            s.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


