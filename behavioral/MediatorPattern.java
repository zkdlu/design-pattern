package behavioral;

import java.util.ArrayList;
import java.util.List;

public class MediatorPattern {
    public class ControlTower {
        private List<Controllee> targets = new ArrayList<>();

        public void regist(Controllee target) {
            targets.add(target);
        }

        public void onEvent(String arg) {
            System.out.println("->");
            for (var target : targets) {
                target.receive(arg);
            }
        }
    }

    public interface Controllee {
        void receive(String arg);
    }

    public class ControlleeA implements Controllee {
        @Override
        public void receive(String arg) {
            System.out.println("controllee: " + arg);
        }
    }

    public interface Controller {
        void setControlTower(ControlTower mediator);
        void notification();
    }

    public class ControllerA implements Controller {
        ControlTower mediator;

        @Override
        public void setControlTower(ControlTower mediator) {
            this.mediator = mediator;
        }

        @Override
        public void notification() {
            System.out.println("controller: hello");
            mediator.onEvent("hello");
        }
    }
    
    public static void main(String[] args) {
        new MediatorPattern().run();
    }

    void run() {
        ControlTower mediator = new ControlTower();
        ControllerA controller = new ControllerA();
        ControlleeA controllee = new ControlleeA();

        mediator.regist(controllee);
        controller.setControlTower(mediator);
        controller.notification();
    }
}
