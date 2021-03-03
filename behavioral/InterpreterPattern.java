package behavioral;

public class InterpreterPattern {
    public interface Expression {
        Object interpret();
    }

    public class ConstantExpression implements Expression {
        private final String constant;
        public ConstantExpression(String context) {
            this.constant = context;
        }

        @Override
        public Object interpret() {
            return Integer.parseInt(constant);
        }
    }

    public class AddExpression implements Expression {
        private final Expression first;
        private final Expression second;

        public AddExpression(String context) throws Exception {
            int plus = context.indexOf("+");
            if (plus != -1) {
                first = new ConstantExpression(context.substring(0, plus));
                second = new ConstantExpression(context.substring(plus + 1));
            } else {
                throw new Exception();
            }
        }

        @Override
        public Object interpret() {
            return (Integer)first.interpret() + (Integer)second.interpret();
        }
    }

    public static void main(String[] args) throws Exception {
        new InterpreterPattern().run();
    }

    void run() throws Exception {
        AddExpression add = new AddExpression("1+2");

        System.out.println(add.interpret());
    }
}
