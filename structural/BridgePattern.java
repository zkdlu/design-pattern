package structural;

import javax.sound.midi.Soundbank;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class BridgePattern {
    public interface BridgeHandler {
        void todo();
    }

    public class AMethod implements BridgeHandler {
        @Override
        public void todo() {
            System.out.println("AAAA");
        }
    }

    public abstract class Bridge {
        private final BridgeHandler bridgeHandler;
        public Bridge(BridgeHandler bridgeHandler) {
            this.bridgeHandler = bridgeHandler;
        }

        public void todo() {
            bridgeHandler.todo();
        }

        public abstract void start();
    }

    public class MyBridge extends Bridge {
        public MyBridge(BridgeHandler handler) {
            super(handler);
        }

        @Override
        public void start() {
            System.out.println("시작");
        }
    }

    public static void main(String[] args) {
        new BridgePattern().run();
    }

    void run() {
        Bridge bridge = new MyBridge(new AMethod());
        
        bridge.start();
        bridge.todo();
    }
}
