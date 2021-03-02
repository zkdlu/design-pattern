package structural;

public class DecoratorPattern {
    public interface Human {
        String getName();
    }

    public class SimpleHuman implements Human {
        @Override
        public String getName() {
            return "사람";
        }
    }

    public abstract class HumanSkill implements Human {
        protected Human human;

        public HumanSkill(Human human) {
            this.human = human;
        }

        @Override
        public abstract String getName();
    }

    public class RunningHuman extends HumanSkill {
        public RunningHuman(Human human) {
            super(human);
        }

        @Override
        public String getName() {
            return "달리는 " + human.getName();
        }
    }

    public class FlyHuman extends HumanSkill {
        public FlyHuman(Human human) {
            super(human);
        }

        @Override
        public String getName() {
            return "날으는 " + human.getName();
        }
    }

    public static void main(String[] args) {
        new DecoratorPattern().run();
    }

    void run() {
        Human human = new SimpleHuman();
        Human runningHuman = new RunningHuman(human);
        Human flyHuman = new FlyHuman(runningHuman);

        System.out.println(flyHuman.getName());
    }
}
