package dataStructures.tree;

public class heightBT {
    public static int height(Node root) {
        // Write your code here.
       if(root==null) return -1;
      int left=height(root.left);
      int right= height(root.right);
      
  return left>right ? left+1 : right+1;      
  }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(7);

        // Calculate the height of the binary tree
        int treeHeight = height(root);

        // Output the height
        System.out.println("Height of the binary tree: " + treeHeight);
    }
            
      
}

