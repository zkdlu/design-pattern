package creational;

public class SingletonPattern {
    public static class SingleObj {
        private static class LazyHolder {
            public static final SingleObj INSTANCE = new SingleObj();
        }

        private SingleObj() {}

        public static SingleObj getInstnace() {
            return LazyHolder.INSTANCE;
        }

        public void run() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        new SingletonPattern().run();
    }

    public void run() {
        SingleObj instance = SingleObj.getInstnace();
        instance.run();
    }
}
