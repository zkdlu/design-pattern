package creational;

public class BuilderPattern {
    
    public static class Target {
        private int id;
        private String name;

        private Target(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + " : " + name;
        }

        public static TargetBuilder builder() {
            return new TargetBuilder();
        }

        public static class TargetBuilder {
            private int id = 0;
            private String name = null;

            public TargetBuilder() {
            }

            public TargetBuilder id(int id) {
                this.id = id;
                return this;
            }

            public TargetBuilder name(String name) {
                this.name = name;
                return this;
            }

            public Target build() {
                return new Target(id, name);
            }
        }
    }

    public static void main(String[] args) {
        Target target = Target.builder()
            .id(1)
            .name("hello")
            .build();

        System.out.println(target.toString());
    }
}

