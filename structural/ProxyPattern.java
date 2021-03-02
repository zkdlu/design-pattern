package structural;

public class ProxyPattern {
    public interface Take {
        void todo();
    }

    public class Virtual implements Take {
        private final Take real = new Real();

        @Override
        public void todo() {
            System.out.println("Proxy");
            real.todo();
        }
    }

    public class Real implements Take { 
        @Override
        public void todo() {
            System.out.println("Real");
        }
    }

    public static void main(String[] args) {
        new ProxyPattern().run();
    }

    void run() {
        Virtual p = new Virtual();
        p.todo();
    }
}
