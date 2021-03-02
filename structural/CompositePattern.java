package structural;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    public interface Node {
        String getName();
    }

    public class Directory implements Node {
        private final String name = "DIRECTORY";
        private final List<Node> nodes = new ArrayList<>();

        @Override
        public String getName() {
            return name;
        }

        public List<Node> getNodes() {
            return nodes;
        }

        public void add(Node node) {
            nodes.add(node);
        }
    }

    public class File implements Node {
        private final String name = "FILE";

        @Override
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        new CompositePattern().run();
    }

    void run() {
        Directory dir = new Directory();
        Directory dir2 = new Directory();

        File file = new File();
        File file2 = new File();

        dir.add(file);
        dir2.add(file2);

        dir.add(dir2);

        printNode(dir, 0);
    }

    void printNode(Node root, int depth) {
        for (int i = 0; i < depth; i++) System.out.print(" ");
        
        System.out.println(root.getName());

        if (root instanceof Directory) {
            Directory dir = (Directory) root;

            for (Node node : dir.getNodes()) {
                printNode(node, depth + 1);
            }
        }
    }
}
