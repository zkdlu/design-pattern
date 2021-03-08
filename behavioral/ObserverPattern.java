package behavioral;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

    public interface Subject {
        void attach(Observer o);
        void detach(Observer o);
        void notificate();
    }

    public interface Observer {
        void update(String data);
    }

    public class SimpleObserver implements Observer {
        @Override
        public void update(String data) {
            System.out.println("업데이트 : " + data);
        }
    }

    public class SimpleSubject implements Subject {
        private final List<Observer> observers = new ArrayList<>();
        private String data;

        public void setData(String data) {
            this.data = data;
            onChanged();
        }

        private void onChanged() {
            notificate();
        }

        @Override
        public void attach(Observer o) {
            observers.add(o);
        }

        @Override
        public void detach(Observer o) {
            if (observers.contains(o)) {
                observers.remove(o);
            }
        }

        @Override
        public void notificate() {
            for (Observer o : observers) {
                o.update(data);
            }
        }
    }

    public static void main(String[] args) {
        new ObserverPattern().run();
    }

    void run() {
        Observer observer = new SimpleObserver();
        SimpleSubject subject = new SimpleSubject();

        subject.attach(observer);
        subject.setData("Hello");
    }
}
