package structural;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPattern {
    public class Common {
        private final String common = "common";
        public String getCommon() {
            return common;
        }
    }

    public class Special extends Common {
        private String special;

        public Special(String special) {
            this.special = special;
            System.out.println("생성: " + special);
        }

        public String getSpecial() {
            return special;
        }
    }

    public class CommonFactory {
        private final Map<String, Common> map = new HashMap<>();

        public Common getSpecial(String key) {
            Special special = (Special) map.get(key);

            if (special == null) {
                special = new Special(key);
                map.put(key, special);
            }

            return special;
        }
    }

    public static void main(String[] args) {
        new FlyweightPattern().run();
    }

    void run() {
        CommonFactory factory = new CommonFactory();
        factory.getSpecial("1");
        factory.getSpecial("2");
        factory.getSpecial("1");
    }
}
