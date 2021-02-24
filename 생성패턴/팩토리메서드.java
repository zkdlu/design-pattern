public class 팩토리메서드 {
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
        팩토리메서드 p = new 팩토리메서드();
        p.run();
    }

    public void run() {
        KeyboardFactory factory = new KeyboardFactory();
        factory.createKeyboard("LG");
    }
}