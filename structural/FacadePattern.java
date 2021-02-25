package structural;

public class FacadePattern {
    
    public interface Surface {
        void run();
    }

    public class Inner implements Surface {
        @Override
        public void run() {
            System.out.println("Inner");
        }
    }

    public class OtherInner implements Surface {
        @Override
        public void run() {
            System.out.println("other inner");
        }
    }

    public class InnerUser {
        private Surface inner = new Inner();
        private Surface otherInner = new OtherInner();

        public InnerUser() {

        }

        public void runInner() {
            inner.run();
        }

        public void runOther() {
            otherInner.run();
        }
    }
    
    public static void main(String[] args) {
        FacadePattern f = new FacadePattern();
        f.run();
    }

    public void run() {
        InnerUser innerUser = new InnerUser();
        innerUser.runInner();
        innerUser.runOther();
    }
}
