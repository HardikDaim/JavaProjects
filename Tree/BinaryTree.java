package Tree;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class CreateBinaryTree {
        static int idx = -1;
        
        public static Node BuildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            
            Node newNode = new Node(nodes[idx], null, null);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            
            return newNode;
        }
    }
    // Count Number of Nodes
    public static int CountOfNodes(Node root) {
        // Base case
        if(root == null) {
            return 0;
        }
        int leftNodes = CountOfNodes(root.left);
        int rightNodes = CountOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTree tree = new BinaryTree();
        Node root = CreateBinaryTree.BuildTree(nodes);
     
        System.out.println(CountOfNodes(root));
    }
}
