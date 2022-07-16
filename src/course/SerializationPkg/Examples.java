package course.SerializationPkg;
import java.io.*;
public class Examples {
    public static void main(String[] args) {
        Cars polo = new Cars("VolsWagon","polo", 2020 );
        try {
            FileOutputStream file = new FileOutputStream("polo.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(polo);
            file.close();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Serialized Data is saved in polo.ser");
    }
}
