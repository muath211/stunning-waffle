import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DFS {

    static class Node {
        public int value;
        public List<Node> children = new ArrayList<>();

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }


    public static void main(String[] args) {
        Node tree = new Node();
        tree.value = 1;
        tree.children = new ArrayList<>();

        Node l1 = new Node();
        l1.value = 2;
        l1.children = new ArrayList<>();

        Node l2 = new Node();
        l2.value = 4;
        l1.children.add(l2);

        Node l22 = new Node();
        l22.value = 5;
        l1.children.add(l22);

        Node r1 = new Node();
        r1.value = 3;
        r1.children = new ArrayList<>();

        Node r2 = new Node();
        r2.value = 6;
        r1.children.add(r2);

        Node r22 = new Node();
        r22.value = 7;
        r1.children.add(r22);


        tree.children.add(l1);
        tree.children.add(r1);

        DFS bfs = new DFS();
        bfs.dfss(tree, 6);

        System.out.println(bfs.hi);


    }

    LinkedList<Node> hi = new LinkedList<>();
    int level = 1;

    public void dfss(Node node, int key) {
        dfs(node, key, 1);
    }

    public void dfs(Node node, int key, int level) {
        if (node == null) {
            return;
        }

        if (node.value == key) {
            System.out.println(level);
            return;
        }

        for (Node n : node.children) {
            dfs(n, key, level + 1);
        }


    }


}
