package behavioral;

public class VisitorPattern {
    public interface Visitor {
        void visit(SimpleElement element);
        void visit(OtherElement element);
    }

    public interface Element {
        void accept(Visitor v);
    }

    public class SimpleElement implements Element {
        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }
    }

    public class OtherElement implements Element {
        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }
    }

    public class SimpleVisitor implements Visitor {
        @Override
        public void visit(OtherElement element) {
            System.out.println("other");
        }

        @Override
        public void visit(SimpleElement element) {
            System.out.println("simple");
        }
    }

    public static void main(String[] args) {
        new VisitorPattern().run();
    }

    void run() {
        SimpleVisitor visitor = new SimpleVisitor();

        Element simple = new SimpleElement();
        Element other = new OtherElement();
        
        simple.accept(visitor);
        other.accept(visitor);
    }
}
