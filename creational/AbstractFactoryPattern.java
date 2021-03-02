package creational;

public class AbstractFactoryPattern {
    
    public interface Keyboard {
    }

    public interface Mouse {
    }

    public class LGKeyboard implements Keyboard {
        public LGKeyboard() {
            System.out.println("LG 키보드");
        }
    }

    public class LGMouse implements Mouse {
        public LGMouse() {
            System.out.println("LG 마우스");
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

    public class MouseFactory {
        public Mouse createMouse(String type) {
            switch (type) {
                case "LG":
                    return new LGMouse();
                default:
                    return null;
            }
        }
    }

    public class Computer {
        public Computer(Keyboard keybaord, Mouse mouse) {
            System.out.println("Computer 완성");
        }
    }

    public class ComputerFactory {
        private final KeyboardFactory keyboardFactory = new KeyboardFactory();
        private final MouseFactory mouseFactory = new MouseFactory();

        public Computer createComputer(String type) {
            Keyboard keyboard= keyboardFactory.createKeyboard(type);
            Mouse mouse = mouseFactory.createMouse(type);

            return new Computer(keyboard, mouse);
        }
    }

    public static void main(String[] args) {
        AbstractFactoryPattern p = new AbstractFactoryPattern();
        p.run();
    }

    public void run() {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.createComputer("LG");
    }
}