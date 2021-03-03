package behavioral;

public class ChainOfResponsibilityPattern {
    public interface Handler {
        void handleRequest();
    }

    public class PreFilter implements Handler {
        private final Handler successor;

        public PreFilter(Handler handler) {
            successor = handler;
        }

        @Override
        public void handleRequest() {
            System.out.println("pre");

            successor.handleRequest();
        }
    }

    public class Service implements Handler {
        private final Handler successor;

        public Service(Handler handler) {
            this.successor = handler;
        }

        @Override
        public void handleRequest() {
            System.out.println("service");

            successor.handleRequest();
        }
    }

    public class PostFilter implements Handler {
        @Override
        public void handleRequest() {
            System.out.println("post");
        }
    }

    public static void main(String[] args) {
        new ChainOfResponsibilityPattern().run();
    }

    void run() {
        PostFilter postFilter = new PostFilter();
        Service service = new Service(postFilter);
        PreFilter preFilter = new PreFilter(service);

        preFilter.handleRequest();
    }
}
