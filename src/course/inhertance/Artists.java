package course.inhertance;

public class Artists extends Humans{
    public void paint(){
        System.out.println(getName()+ " is going to paint man");
    }

    public static void main(String[] args) {
        Artists a = new Artists();
        a.setName("tej");
        a.setAge(22);
        a.setGender("Male");
        a.paint();
        a.sleep();
    }

}
