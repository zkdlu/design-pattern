package behavioral;

public class CommandPattern {
    public interface Command {
        void execute();
    }

    public class Fire {
        private Command command;

        public Fire(Command command) {
            this.command = command;
        }

        public void run() {
            command.execute();
        }
    }

    public class Target {
        public void on() {
            System.out.println("Target on");
        }
    }

    public class TargetCommand implements Command {
        private Target target;

        public TargetCommand(Target target) {
            this.target = target;
        }

        @Override
        public void execute() {
            target.on();
        }
    }

    public static void main(String[] args) {
        CommandPattern cp = new CommandPattern();
        cp.run();
    }

    public void run() {
        Command targetCommand = new TargetCommand(new Target());
        
        Fire fire = new Fire(targetCommand);
        fire.run();
    }
}
