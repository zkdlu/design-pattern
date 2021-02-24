package creational;

public class Singleton {
    public static class SingleObj {
        private static final SingleObj instance = new SingleObj();

        private SingleObj() {}

        public static SingleObj getInstnace() {
            return instance;
        }

        public void run() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        SingleObj instance = SingleObj.getInstnace();
        instance.run();
    }
}
