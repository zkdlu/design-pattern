package behavioral;

public class TemplateMethodPattern {
    public abstract class Abstract {
        protected abstract void hook();

        public final void template() {
            hook();
        }
    }

    public class Concrete extends Abstract {
        @Override
        protected void hook() {
            System.out.println("Concrete hook");
        }
    }

    public static void main(String[] args) {
        new TemplateMethodPattern().run();
    }

    void run() {
        Abstract concrete = new Concrete();
        concrete.template();
    }
}
