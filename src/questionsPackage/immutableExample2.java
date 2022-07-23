package questionsPackage;

//once object is created, it's value should not change
class Engine {
    int speed;
    Engine(int speed){
        this.speed = speed;
    }
}

public final class immutableExample2 {

        private final int id;
        private final String name;
        private final Engine engine;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public immutableExample2(int i, String s, Engine e){
            this.id = i;
            this.name = s;
            Engine newEngine = new Engine(e.speed);
            this.engine = newEngine;
        }

    public static void main(String[] args) {
            Engine e = new Engine(50);
            immutableExample2 a = new immutableExample2(1, "Tejas", e);
            System.out.println(a.engine.speed);
            e.speed = 30;
            System.out.println(a.engine.speed);

    }
}






