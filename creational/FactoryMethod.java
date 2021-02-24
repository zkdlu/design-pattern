package creational;

public class FactoryMethod {
    public interface Keyboard {
    }

    public class LGKeyboard implements Keyboard {
        public LGKeyboard() {
            System.out.println("LG 키보드");
        }
    }

    public class KeyboardFactory {
        public Keyboard createKeyboard(String type) {
            switch (type) {
                case "LG":
                    return new LGKeyboard();
                default:
                    return null;
            }
        }
    }

    public static void main(String[] args) {
        FactoryMethod p = new FactoryMethod();
        p.run();
    }

    public void run() {
        KeyboardFactory factory = new KeyboardFactory();
        factory.createKeyboard("LG");
    }
}