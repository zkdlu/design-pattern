package behavioral;

public class StatePattern {
    public interface State {
        void apply();
    }

    public class FirstState implements State {
        @Override
        public void apply() {
            System.out.println("상태 1");
        }
    }

    public class SecondState implements State {
        @Override
        public void apply() {
            System.out.println("상태 2");
        }
    }

    public class Target {
        private State state;

        public Target() {
            this.state = new FirstState();
        }

        public void setState(State state) {
            this.state = state;
        }

        public void apply() {
            state.apply();
        }
    }

    public static void main(String[] args) {
        new StatePattern().run();
    }

    void run() {
        Target target = new Target();
        FirstState state1 = new FirstState();
        SecondState state2 = new SecondState();
        
        target.apply();
        target.setState(state2);
        target.apply();
        target.setState(state1);
        target.apply();
    }
}
