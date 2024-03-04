package isp.lab3.exercise1;

//import jdk.internal.misc.FileSystemOption;

public class Tree {
    private int height;

    Tree() {
        height = 15;
    }

    public int add(int m) {
        while (m >= 1) {
            height = height + m;
            m--;
        }
        return height;

    }

    public String toString() {
        return "Height of the tree is " + height;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(3);
        System.out.println(tree);
    }


}
