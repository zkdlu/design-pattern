package behavioral;

public class StrategyPattern {
    public class Controller {
        private ServiceStrategy serviceStrategy;

        public Controller(ServiceStrategy serviceStrategy) {
            this.serviceStrategy = serviceStrategy;
        }

        public void invoke() {
            serviceStrategy.doService();
        }
    }

    public interface ServiceStrategy {
        public void doService();
    }

    public class MyServiceStrategy implements ServiceStrategy {
        @Override
        public void doService() {
            System.out.println("Do my service");
        }
    }

    public static void main(String[] args) {
        new StrategyPattern().run();
    }

    public void run() {
        ServiceStrategy serviceStrategy = new MyServiceStrategy();
        Controller controller = new Controller(serviceStrategy);

        controller.invoke();
    }
}
