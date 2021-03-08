package behavioral;

import java.util.ArrayList;
import java.util.List;

public class MementoPattern {
    public class Memento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public class Originator { 
        private String state;
        public void setState(String state) {
            this.state = state;
        }
        public String getState() {
            return state;
        }
        public Memento saveState() {
            return new Memento(state);
        }

        public void getStateFromMemento(Memento memento) {
            state = memento.getState();
        }
    }

    public class CareTaker {
        private List<Memento> memList = new ArrayList<>();

        public void add(Memento memento) {
            memList.add(memento);
        }

        public Memento get(int index) {
            return memList.get(index);
        }
    }


    public static void main(String[] args) {
        new MementoPattern().run();
    }

    void run() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        originator.setState("State 2");
        careTaker.add(originator.saveState());
        originator.setState("State 3");
        careTaker.add(originator.saveState());
        originator.setState("State 4");

        System.out.println(originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println(originator.getState());
    }
}
