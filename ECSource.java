import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo (not recursive)
    ArrayList<T> newLink = new ArrayList<>();
    while (head != null) {
      newLink.add(head.val);
      head = head.next;
    }
    for (int i = 0; i < newLink.size(); i++){
      if (i+1 != newLink.size()){
        if (newLink.get(i) != newLink.get(i+1)){
          return false;
        }
      } else if (newLink.size() == 1) {
        return true;
      } else {
        if (newLink.get(i-1) != newLink.get(i)){
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
        //Node<String> z = new Node<>("z");
        // z

        // Printing solution
        Node<Integer> u = new Node<>(2);
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(3);
        Node<Integer> x = new Node<>(2);
        Node<Integer> y = new Node<>(2);

        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;

        // 2 -> 2 -> 2 -> 2 -> 2

        // Source.isUnivalueList(u); // true
        System.out.println((ECSource.isUnivalueList(u)));

        Node<String> z = new Node<>("z");
        // z
        System.out.println((ECSource.isUnivalueList(z)));
    }
}
