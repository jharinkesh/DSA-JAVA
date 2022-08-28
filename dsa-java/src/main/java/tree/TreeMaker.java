package tree;

public class TreeMaker {

  public static Node makeDefaultTree() {
    return new Node(new Node(null, 2, new Node(4)), 1, new Node(new Node(5), 3, null));
  }

  public static Node makeDefaultTree2() {
    return new Node(new Node(null, 2, new Node(40)), 1,
        new Node(new Node(new Node(6), 50, new Node(11)), 3, null));
  }

  public static Node makeBST() {
    return new Node(new Node(new Node(2), 3, new Node(1)), 4,
        new Node(new Node(9), 10, new Node(12)));
  }

  public static Node makeMirrorTree() {
    return new Node(new Node(new Node(6), 5, new Node(7)), 4,
        new Node(new Node(7), 5, new Node(6)));
  }
}
