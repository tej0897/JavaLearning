package course.SerializationPkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) {
        Cars polo = null;
        try {
            FileInputStream fileIn = new FileInputStream("polo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            polo = (Cars) in.readObject();
            in.close();
            fileIn.close();

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(polo.modelName);
    }
}
