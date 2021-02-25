package structural;

public class AdapterPattern {
    public interface MyLib {
        void print();
    }

    public class MyLibClass implements MyLib {
        @Override
        public void print() {
            System.out.println("my lib");
        }
    }

    public interface OtherLib {
        void printString(String str);
    }
    public class OtherLibClass implements OtherLib {
        @Override
        public void printString(String str) {
            System.out.println(str);
        }
    }

    public class OtherLibAdapter implements MyLib {
        private OtherLib otherLib;

        public OtherLibAdapter(OtherLib otherLib) {
            this.otherLib = otherLib;
        }

        @Override
        public void print() {
            otherLib.printString("my lib adapter");
        }
    }

    public static void main(String[] args) {
        AdapterPattern adapter = new AdapterPattern();
        adapter.run();
    }
    
    public void run() {
        OtherLib otherLib = new OtherLibClass();
        MyLib otherAdapter = new OtherLibAdapter(otherLib);
        otherAdapter.print();
    }
}
