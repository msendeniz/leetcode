package dataStructures.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class topView {
    

    public static void topView(Node root) {
        class QueueNode{
            int hd;
            Node node;
            public QueueNode(Node node, int hd){
                this.hd = hd;
                this.node =node;
            }
        }
      Queue <QueueNode> q = new LinkedList<>();
      Map <Integer, Node> map = new TreeMap<Integer, Node>(); 
      
      if(root == null) return;
      else q.add(new QueueNode(root, 0));

      while(!q.isEmpty()){
        QueueNode tempNode = q.poll();
        
        if(!map.containsKey(tempNode.hd)){
            map.put(tempNode.hd, tempNode.node);
        }
        if(tempNode.node.left != null){
            q.add(new QueueNode(tempNode.node.left, tempNode.hd -1));
        }
        if(tempNode.node.right != null){
            q.add(new QueueNode(tempNode.node.right, tempNode.hd +1));
        }
      }
      for (Map.Entry<Integer, Node> entry :
             map.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
    }

    public static void main(String[] args) {
        // Create the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        System.out.println("Top view of the binary tree:");
        topView(root);
    }
}
