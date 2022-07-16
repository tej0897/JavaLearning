package course.SerializationPkg;

import java.io.Serializable;

public class Cars implements Serializable {
    String companyName;
    String modelName;
    int year;

    public Cars(String companyName, String modelName, int year) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.year = year;
    }
}
