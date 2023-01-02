import org.w3c.dom.Node;

public class BinaryTree {

    class Node{
        private int value;
        private Node right;
        private Node left;
        public Node(int value, Node right, Node left){
            this.value = value;
            this.right = right;
            this.left = left;
        }
    }

        public static Boolean contains(Node root,  int value){
            if(root == null){
                return false;
            }
            if(root.value == value){
                return true;
            }
            if(root.value < value){
                return contains(root.right, value);
            }else{
                return contains(root.left, value);
            }
        }

    public static void main(String[] args) {
//        Node n1 = new Node(1, null, null);
//        Node n3 = new Node(3, null, null);
//        Node n2 = new Node(2, n1, n3);

//        System.out.println(contains(n2, 3));
    }
}
